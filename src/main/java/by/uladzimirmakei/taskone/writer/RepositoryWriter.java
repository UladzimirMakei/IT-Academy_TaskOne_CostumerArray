package by.uladzimirmakei.taskone.writer;

import by.uladzimirmakei.taskone.exception.FileException;

public interface RepositoryWriter {
    void write() throws FileException;
}
