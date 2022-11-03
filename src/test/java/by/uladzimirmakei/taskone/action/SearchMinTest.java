package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchMinTest extends BaseTest {

    @Test
    public void testSearchMinValue() {
        assertThat(searchAction.searchMinValue(array).getAsInt())
                .as("SearchAction search min value with positive values does not work")
                .isEqualTo(1);
    }

    @Test
    public void testSearchMinNegativeValue() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(searchAction.searchMinValue(array).getAsInt())
                .as("SearchAction search min value with negative values does not work")
                .isEqualTo(-7);
    }

    @Test
    public void testSearchMinZeroValue() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(searchAction.searchMinValue(array).getAsInt())
                .as("SearchAction search min value with zero values does not work")
                .isZero();
    }
}
