package by.uladzimirmakei.taskone.service.action;

import by.uladzimirmakei.taskone.repository.entity.MathParams;

import java.util.Optional;
import java.util.OptionalInt;

public interface SummarizeAction<T> {

    OptionalInt summarizeAll(T input);

    Optional<MathParams> calculateAll(T input);

    OptionalInt summarizePositive(T input);

    OptionalInt summarizeNegative(T input);
}
