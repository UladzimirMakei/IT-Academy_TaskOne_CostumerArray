package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.Specification;

import java.util.Arrays;

public class AverageValueSpecification implements Specification {
    private double averageValue;

    public AverageValueSpecification(double averageValue) {
        this.averageValue = averageValue;
    }

    @Override
    public boolean specify(CostumerArray array) {
        return (averageValue < Arrays.stream(array.getArray()).average().getAsDouble());
    }
}
