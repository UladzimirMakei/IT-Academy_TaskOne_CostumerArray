package by.uladzimirmakei.taskone.util;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayUtilTest {
    private static CostumerArray nullCostumerArray;
    private static int[] validArray = new int[3];
    private static int[] invalidArray = new int[0];
    private static int[] invalidArrayTwo;


    @Test
    public static void testValidArray() {
        assertThat(ArrayUtil.isArrayValid(validArray))
                .as("Array util does not work with valid array")
                .isTrue();
    }

    @Test
    public static void testNullArray() {
        assertThat(ArrayUtil.isArrayValid(invalidArrayTwo))
                .as("Array util does not work with null array")
                .isFalse();
    }

    @Test
    public static void testNullCostumerArray() {
        assertThat(ArrayUtil.isArrayValid(nullCostumerArray))
                .as("Array util does not work with null array")
                .isFalse();
    }

    @Test
    public static void testZeroLengthArray() {
        assertThat(ArrayUtil.isArrayValid(invalidArray))
                .as("Array util does not work with zero length array")
                .isFalse();
    }
}
