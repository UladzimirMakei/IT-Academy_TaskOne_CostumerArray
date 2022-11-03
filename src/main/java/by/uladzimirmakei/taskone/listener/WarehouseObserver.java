package by.uladzimirmakei.taskone.listener;

import by.uladzimirmakei.taskone.exception.ArrayException;

public interface WarehouseObserver<T> {
    void update(T t) throws ArrayException;
}
