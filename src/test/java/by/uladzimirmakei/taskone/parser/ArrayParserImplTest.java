package by.uladzimirmakei.taskone.parser;

import by.uladzimirmakei.taskone.parser.impl.ArrayParserImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayParserImplTest {
    private static ArrayParserImpl parser = new ArrayParserImpl();

    @DataProvider(name = "stringForParse")
    public Object[][] provideValidString() {
        return new Object[][]{{"1 2 3"}, {"1,2,3"}, {"1 - 2 - 3"}, {"1; 2; 3"}};
    }

    @Test(dataProvider = "stringForParse")
    public static void testArrayParserDot(String stringForParse) {
        assertThat(parser.parse(stringForParse))
                .as("String validator fails with valid data")
                .isEqualTo(new int[]{1, 2, 3});
    }
}