package by.uladzimirmakei.taskone.service.writer;

import by.uladzimirmakei.taskone.repository.exception.FileException;

public interface RepositoryWriter {
    void write() throws FileException;
}
