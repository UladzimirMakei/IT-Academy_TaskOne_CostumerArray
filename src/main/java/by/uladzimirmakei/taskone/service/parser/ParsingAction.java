package by.uladzimirmakei.taskone.service.parser;

public interface ParsingAction<T> {
    int[] parse(T t);
}
