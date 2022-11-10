package by.uladzimirmakei.taskone.service.reader;

import by.uladzimirmakei.taskone.repository.exception.FileException;

public interface ReaderAction<T> {
    T read() throws FileException;
}
