package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SummarizeArrayTest extends BaseTest {

    @Test
    public void testSummarizeArray() {
        assertThat(summarizeAction.summarizeAll(array).getAsInt())
                .as("SearchAction summation with valid values does not work")
                .isEqualTo(12);
    }

    @Test
    public void testSummarizeNegativeArray() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(summarizeAction.summarizeAll(array).getAsInt())
                .as("SearchAction summation with negative values does not work")
                .isEqualTo(-12);
    }

    @Test
    public void testSummarizeZeroArray() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(summarizeAction.summarizeAll(array).getAsInt())
                .as("SearchAction summation with zero does not work")
                .isZero();
    }
}
