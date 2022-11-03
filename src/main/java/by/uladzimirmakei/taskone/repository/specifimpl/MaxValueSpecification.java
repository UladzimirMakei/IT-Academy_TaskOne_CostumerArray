package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.Specification;

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
