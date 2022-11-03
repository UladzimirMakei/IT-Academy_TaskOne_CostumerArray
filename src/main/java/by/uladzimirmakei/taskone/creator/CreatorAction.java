package by.uladzimirmakei.taskone.creator;

import by.uladzimirmakei.taskone.exception.ArrayException;
import by.uladzimirmakei.taskone.exception.ListException;

public interface CreatorAction <T>{
    void create(T t) throws ArrayException, ListException;
}
