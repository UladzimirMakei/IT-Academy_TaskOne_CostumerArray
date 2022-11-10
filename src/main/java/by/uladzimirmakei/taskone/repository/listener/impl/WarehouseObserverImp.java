package by.uladzimirmakei.taskone.repository.listener.impl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.entity.MathParams;
import by.uladzimirmakei.taskone.repository.entity.Warehouse;
import by.uladzimirmakei.taskone.repository.listener.WarehouseObserver;
import by.uladzimirmakei.taskone.service.action.impl.SummarizeActionImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WarehouseObserverImp implements WarehouseObserver<CostumerArray> {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void update(CostumerArray array) {
        logger.log(Level.DEBUG, "Warehouse observer in use with array {}",
                array);
        Warehouse warehouse = Warehouse.getInstance();
        SummarizeActionImpl summarizeAction =
                new SummarizeActionImpl();
        MathParams params = summarizeAction
                .calculateAll(array).get();
        warehouse.put(array.getId(), params);
        logger.log(Level.DEBUG, "Warehouse result {}",
                warehouse.get(array.getId()));
    }
}
