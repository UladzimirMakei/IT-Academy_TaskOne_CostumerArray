package by.uladzimirmakei.taskone.service.creator;

import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.repository.exception.ListException;

public interface CreatorAction<T> {
    void create(T t) throws ArrayException, ListException;
}
