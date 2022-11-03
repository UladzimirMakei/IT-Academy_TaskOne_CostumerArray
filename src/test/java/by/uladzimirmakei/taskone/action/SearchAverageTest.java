package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchAverageTest extends BaseTest {

    @Test
    public void testSearchAverageValue() {
        assertThat(searchAction.searchAverageValue(array).getAsDouble())
                .as("SearchAction search average value with positive values does not work")
                .isEqualTo(4);
    }

    @Test
    public void testSearchAverageZeroValue() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(searchAction.searchAverageValue(array).getAsDouble())
                .as("SearchAction search average value with zero values does not work")
                .isZero();
    }

    @Test
    public void testSearchAverageNegativeValue() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(searchAction.searchAverageValue(array).getAsDouble())
                .as("SearchAction search average value with negative values does not work")
                .isEqualTo(-4);
    }
}
