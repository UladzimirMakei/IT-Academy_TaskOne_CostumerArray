package by.uladzimirmakei.taskone.action;

import by.uladzimirmakei.taskone.service.action.impl.SearchActionImpl;
import by.uladzimirmakei.taskone.service.action.impl.ChangeActionImpl;
import by.uladzimirmakei.taskone.service.action.impl.SummarizeActionImpl;
import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    static Logger logger = LogManager.getLogger();
    SearchActionImpl searchAction = new SearchActionImpl();
    SummarizeActionImpl summarizeAction = new SummarizeActionImpl();
    ChangeActionImpl changeAction = new ChangeActionImpl();
    CostumerArray array;

    @BeforeMethod
    public void initialization() {
        try {
            array = new CostumerArray(new int[]{1, 4, 7});
        } catch (ArrayException e) {
            logger.log(Level.ERROR, "Exception ", e);
        }
    }
}
