package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;

import java.util.Arrays;

public class SumSpecification implements Specification {
    private int sumArray;

    public SumSpecification(int sumArray) {
        this.sumArray = sumArray;
    }

    @Override
    public boolean specify(CostumerArray array) {
        return (sumArray < Arrays.stream(array.getArray()).sum());
    }
}
