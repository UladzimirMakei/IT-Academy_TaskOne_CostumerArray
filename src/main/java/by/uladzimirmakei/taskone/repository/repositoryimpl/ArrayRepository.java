package by.uladzimirmakei.taskone.repository.repositoryimpl;

import by.uladzimirmakei.taskone.repository.Repository;
import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.exception.RepositoryException;
import by.uladzimirmakei.taskone.repository.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository implements Repository<CostumerArray> {

    private List<CostumerArray> storage;


    private ArrayRepository() {
        storage = new ArrayList<>();
    }

    private static class ArrayRepositoryHolder {
        private static final ArrayRepository arrayRepository = new ArrayRepository();
    }

    public static ArrayRepository getInstance() {
        return ArrayRepositoryHolder.arrayRepository;
    }

    @Override
    public List<CostumerArray> getAll() {
        return storage;
    }

    @Override
    public CostumerArray get(long id) {
        return storage.get((int) id);
    }

    @Override
    public void add(CostumerArray array) {
        storage.add(array);
    }

    @Override
    public void update(CostumerArray oldArray, CostumerArray newArray) throws RepositoryException {
        if (storage.contains(oldArray)) {
            int oldArrayIndex = storage.indexOf(oldArray);
            storage.set(oldArrayIndex, newArray);
        } else {
            throw new RepositoryException("This array is not in the storage");
        }
    }

    @Override
    public List<CostumerArray> query(Specification specification) {
        List<CostumerArray> resultList = new ArrayList<>();
        for (CostumerArray array : storage) {
            if (specification.specify(array)) {
                resultList.add(array);
            }
        }
        return resultList;
    }

    @Override
    public void sort(Comparator<CostumerArray> comparator) {
        storage.sort(comparator);
    }

    @Override
    public void remove(long id) {
        storage.removeIf(a -> a.getId() == id);
    }
}
