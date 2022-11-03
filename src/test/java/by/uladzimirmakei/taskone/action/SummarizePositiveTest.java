package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SummarizePositiveTest extends BaseTest {

    @Test
    public void testSummarizePositive() {
        assertThat(summarizeAction.summarizePositive(array).getAsInt())
                .as("SearchAction positive values summation with valid values does not work")
                .isEqualTo(12);
    }

    @Test
    public void testSummarizeNegPositive() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(summarizeAction.summarizePositive(array).getAsInt())
                .as("SearchAction positive values summation with negative values does not work")
                .isZero();
    }

    @Test
    public void testSummarizeZeroPositive() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(summarizeAction.summarizePositive(array).getAsInt())
                .as("SearchAction positive values summation with zero values does not work")
                .isZero();
    }
}