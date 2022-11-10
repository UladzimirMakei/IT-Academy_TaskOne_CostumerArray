package by.uladzimirmakei.taskone.service.action.impl;

import by.uladzimirmakei.taskone.service.action.SummarizeAction;
import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.entity.MathParams;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

import static by.uladzimirmakei.taskone.service.util.ArrayUtil.isCostumerArrayValid;

public class SummarizeActionImpl implements SummarizeAction<CostumerArray> {

    public OptionalInt summarizeAll(CostumerArray input) {
        OptionalInt result = OptionalInt.empty();
        if (isCostumerArrayValid(input)) {
            result = OptionalInt.of(Arrays.stream(input.getArray()).sum());
        }
        return result;
    }

    @Override
    public Optional<MathParams> calculateAll(CostumerArray input) {
        SearchActionImpl searchAction = new SearchActionImpl();
        Optional<MathParams> result = Optional.empty();
        if (isCostumerArrayValid(input)) {
            result = Optional.of(new MathParams(summarizeAll(input).getAsInt(),
                    searchAction.searchAverageValue(input).getAsDouble(),
                    searchAction.searchMaxValue(input).getAsInt(),
                    searchAction.searchMinValue(input).getAsInt()));
        }
        return result;
    }

    @Override
    public OptionalInt summarizePositive(CostumerArray input) {
        OptionalInt result = OptionalInt.empty();
        if (isCostumerArrayValid(input)) {
            result = OptionalInt.of(Arrays.stream(input.getArray())
                    .filter(s -> s > 0).sum());
        }
        return result;
    }

    @Override
    public OptionalInt summarizeNegative(CostumerArray input) {
        OptionalInt result = OptionalInt.empty();
        if (isCostumerArrayValid(input)) {
            result = OptionalInt.of(Arrays.stream(input.getArray())
                    .filter(s -> s < 0).sum());
        }
        return result;
    }
}
