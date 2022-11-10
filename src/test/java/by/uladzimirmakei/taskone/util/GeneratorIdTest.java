package by.uladzimirmakei.taskone.util;

import by.uladzimirmakei.taskone.service.util.GeneratorId;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class GeneratorIdTest {

    @Test
    public static void testGeneratorId() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(GeneratorId.getId(), 1);
        softAssert.assertEquals(GeneratorId.getId(), 2);
        softAssert.assertEquals(GeneratorId.getId(), 3);
        softAssert.assertAll();
    }
}
