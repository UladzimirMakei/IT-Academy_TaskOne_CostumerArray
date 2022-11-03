package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.Specification;

public class IdSpecification implements Specification {
    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(CostumerArray array) {
        return (id == array.getId());
    }
}
