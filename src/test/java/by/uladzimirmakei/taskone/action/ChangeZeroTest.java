package by.uladzimirmakei.taskone.action;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChangeZeroTest extends BaseTest {

    @Test
    public void testChangeZero() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(array.getArray())
                .as("SearchAction search average value does not work")
                .isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    public void testChangeZeroWithNegative() {
        changeAction.changeAllToZero(array.getArray());
        assertThat(array.getArray())
                .as("SearchAction search average value does not work")
                .isEqualTo(new int[]{0, 0, 0});
    }
}
