package by.uladzimirmakei.taskone.repository;

import by.uladzimirmakei.taskone.exception.RepositoryException;

import java.util.Comparator;
import java.util.List;

public interface Repository<T> {

    T get(long id);

    List<T> getAll();

    List<T> query(Specification specification);

    void sort(Comparator comparator);

    void add(T object);

    void update(T oldObject, T newObject) throws RepositoryException;

    void remove(long id) throws RepositoryException;
}
