package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SummarizeNegativeTest extends BaseTest {

    @Test
    public void testSummarizePosNegative() {
        assertThat(summarizeAction.summarizeNegative(array).getAsInt())
                .as("SearchAction negative values summation with positive values does not work")
                .isZero();
    }

    @Test
    public void testSummarizeNegative() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(summarizeAction.summarizeNegative(array).getAsInt())
                .as("SearchAction negative values summation with valid values does not work")
                .isEqualTo(-12);
    }

    @Test
    public void testSummarizeZeroNegative() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(summarizeAction.summarizeNegative(array).getAsInt())
                .as("SearchAction negative values summation with zero does not work")
                .isZero();
    }
}
