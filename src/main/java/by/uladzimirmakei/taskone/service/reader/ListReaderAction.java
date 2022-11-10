package by.uladzimirmakei.taskone.service.reader;

import by.uladzimirmakei.taskone.repository.exception.ListException;

public interface ListReaderAction<T> {
    T read(T inputData) throws ListException;
}
