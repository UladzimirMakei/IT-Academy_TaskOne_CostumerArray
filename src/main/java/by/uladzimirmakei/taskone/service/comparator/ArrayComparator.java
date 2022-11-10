package by.uladzimirmakei.taskone.service.comparator;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;

import java.util.Arrays;
import java.util.Comparator;

public enum ArrayComparator implements Comparator<CostumerArray> {
    AVERAGE_INCREASE {
        @Override
        public int compare(CostumerArray o1, CostumerArray o2) {
            return (int) (Arrays.stream(o1.getArray())
                    .average()
                    .getAsDouble()
                    - Arrays.stream(o2.getArray())
                    .average()
                    .getAsDouble());
        }
    }, SUM_INCREASE {
        @Override
        public int compare(CostumerArray o1, CostumerArray o2) {
            return (Arrays.stream(o1.getArray())
                    .sum()
                    - Arrays.stream(o2.getArray())
                    .sum());
        }
    }
}
