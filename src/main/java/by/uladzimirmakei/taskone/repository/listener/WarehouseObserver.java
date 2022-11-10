package by.uladzimirmakei.taskone.repository.listener;

import by.uladzimirmakei.taskone.repository.exception.ArrayException;

public interface WarehouseObserver<T> {
    void update(T t) throws ArrayException;
}
