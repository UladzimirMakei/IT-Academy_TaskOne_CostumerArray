package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementChangeTest extends BaseTest {

    @Test
    public void testChangePositiveToNegative() {
        changeAction.changePositiveToNegative(array.getArray());
        assertThat(array.getArray())
                .as("SearchAction change positive to negative method does not work")
                .isEqualTo(new int[]{-1, -4, -7});
    }

    @Test
    public void testChangeEvenToOdd() {
        changeAction.changeEvenToOdd(array.getArray());
        assertThat(array.getArray())
                .as("SearchAction change even to odd method does not work")
                .isEqualTo(new int[]{1, 5, 7});
    }
}
