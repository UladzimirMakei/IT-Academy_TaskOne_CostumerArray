package by.uladzimirmakei.taskone.util;

import by.uladzimirmakei.taskone.entity.CostumerArray;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static boolean isIndexValid(int[] array, int index) {
        return (0 <= index && index < array.length);
    }

    public static boolean isIndexAndArrayValid(int[] array, int index) {
        return (array != null && array.length != 0 && 0 <= index && index < array.length);
    }

    public static boolean isCostumerArrayValid(CostumerArray array) {
        return (array != null && array.getArray() != null);
    }

    public static boolean isArrayValid(int[] array) {
        return (array != null && array.length != 0);
    }

    public static boolean isArrayValid(CostumerArray array) {
        return (array != null);
    }
}
