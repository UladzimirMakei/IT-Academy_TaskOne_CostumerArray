package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchMaxTest extends BaseTest {

    @Test
    public void testSearchMaxValue() {
        assertThat(searchAction.searchMaxValue(array).getAsInt())
                .as("SearchAction search max value with positive values does not work")
                .isEqualTo(7);
    }

    @Test
    public void testSearchMaxNegativeValue() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(searchAction.searchMaxValue(array).getAsInt())
                .as("SearchAction search max value with negative values does not work")
                .isEqualTo(-1);
    }

    @Test
    public void testSearchMaxZeroValue() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(searchAction.searchMaxValue(array).getAsInt())
                .as("SearchAction search max value with zero values does not work")
                .isZero();
    }
}
