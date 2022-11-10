package by.uladzimirmakei.taskone.reader;

import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.service.reader.impl.ListReaderActionImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListReaderImplTest {
    private static ListReaderActionImpl reader = new ListReaderActionImpl();
    private static List<String> testList = new ArrayList<>();
    private static List<String> resultList = new ArrayList<>();

    @BeforeClass
    public void initializeList() {
        testList = List.of("1 2 3", "12@3, 1, 3", "1,2,3", "1, 2b, 3", "1 - 2 - 3", " ", "1; 2; 3", "1; 2; 3;");
        resultList = List.of("1 2 3", "1,2,3", "1 - 2 - 3", "1; 2; 3");
    }

    @Test
    public static void testListValidator() throws ListException {
        assertThat(reader.read(testList))
                .as("String validator fails with valid data")
                .isEqualTo(resultList);
    }

    @Test(expectedExceptions = ListException.class, expectedExceptionsMessageRegExp = "Input list to validate is empty")
    public static void testListValidatorEmptyList() throws ListException {
        assertThat(reader.read(new ArrayList<>()))
                .as("String validator fails with valid data")
                .isNull();
    }
}
