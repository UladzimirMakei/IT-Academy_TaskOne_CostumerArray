package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;

import java.util.Arrays;

public class MaxValueSpecification implements Specification {
    private int maxValue;

    public MaxValueSpecification(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean specify(CostumerArray array) {
        return (maxValue < Arrays.stream(array.getArray()).max().getAsInt());
    }
}
