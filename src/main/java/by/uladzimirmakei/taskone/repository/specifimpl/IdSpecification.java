package by.uladzimirmakei.taskone.repository.specifimpl;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;

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
