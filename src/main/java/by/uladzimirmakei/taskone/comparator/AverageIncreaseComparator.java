package by.uladzimirmakei.taskone.comparator;

import by.uladzimirmakei.taskone.entity.CostumerArray;

import java.util.Arrays;
import java.util.Comparator;

public class AverageIncreaseComparator implements Comparator<CostumerArray> {
    @Override
    public int compare(CostumerArray o1, CostumerArray o2) {
        return (int) (Arrays.stream(o1.getArray()).average().getAsDouble()
                - Arrays.stream(o2.getArray()).average().getAsDouble());
    }
}
