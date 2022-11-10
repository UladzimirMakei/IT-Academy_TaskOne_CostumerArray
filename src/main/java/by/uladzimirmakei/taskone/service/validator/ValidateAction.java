package by.uladzimirmakei.taskone.service.validator;

public interface ValidateAction<T> {
    boolean validate(T input);
}
