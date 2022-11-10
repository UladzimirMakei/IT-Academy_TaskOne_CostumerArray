package by.uladzimirmakei.taskone.repository.repositoryimpl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.exception.RepositoryException;
import by.uladzimirmakei.taskone.repository.specifimpl.Specification;

import java.util.Comparator;
import java.util.List;

public interface Repository<T> {

    T get(long id);

    List<T> getAll();

    List<T> query(Specification specification);

    void sort(Comparator<CostumerArray> comparator);

    void add(T object);

    void update(T oldObject, T newObject) throws RepositoryException;

    void remove(long id) throws RepositoryException;
}
