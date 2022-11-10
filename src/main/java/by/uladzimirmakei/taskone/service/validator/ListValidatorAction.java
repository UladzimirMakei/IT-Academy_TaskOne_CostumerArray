package by.uladzimirmakei.taskone.service.validator;

import by.uladzimirmakei.taskone.repository.exception.ListException;

public interface ListValidatorAction<T> {
    T read(T inputData) throws ListException;
}
