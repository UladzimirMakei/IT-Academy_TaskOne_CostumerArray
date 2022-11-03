package by.uladzimirmakei.taskone.parser;

public interface ParsingAction<T> {
    int[] parse(T t);
}
