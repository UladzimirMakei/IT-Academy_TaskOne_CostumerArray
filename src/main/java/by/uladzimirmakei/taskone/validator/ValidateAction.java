package by.uladzimirmakei.taskone.validator;

import by.uladzimirmakei.taskone.exception.ListException;

public interface ValidateAction<T> {
    boolean validate (T input);


}
