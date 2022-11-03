package by.uladzimirmakei.taskone.comparator;

import by.uladzimirmakei.taskone.entity.CostumerArray;

import java.util.Arrays;
import java.util.Comparator;

public class SumIncreaseComparator implements Comparator<CostumerArray> {

    @Override
    public int compare(CostumerArray o1, CostumerArray o2) {
        return (Arrays.stream(o1.getArray()).sum() - Arrays.stream(o2.getArray()).sum());
    }
}
