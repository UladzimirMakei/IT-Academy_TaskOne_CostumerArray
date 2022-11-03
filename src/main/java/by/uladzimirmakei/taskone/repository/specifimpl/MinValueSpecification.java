package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.Specification;

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
