package by.uladzimirmakei.taskone.reader;

import by.uladzimirmakei.taskone.exception.FileException;

public interface ReaderAction<T> {
    T read() throws FileException;
}
