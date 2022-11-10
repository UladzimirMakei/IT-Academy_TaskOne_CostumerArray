package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;

import java.util.Arrays;

public class MinValueSpecification implements Specification {
    private int minValue;

    public MinValueSpecification(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public boolean specify(CostumerArray array) {
        return (minValue > Arrays.stream(array.getArray()).min().getAsInt());
    }
}
