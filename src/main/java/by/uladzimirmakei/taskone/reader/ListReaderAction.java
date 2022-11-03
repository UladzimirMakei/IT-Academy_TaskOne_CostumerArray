package by.uladzimirmakei.taskone.reader;

import by.uladzimirmakei.taskone.exception.ListException;

public interface ListReaderAction<T> {
    T read(T inputData) throws ListException;
}
