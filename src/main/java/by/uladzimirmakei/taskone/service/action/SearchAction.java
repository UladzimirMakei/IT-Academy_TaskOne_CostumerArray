package by.uladzimirmakei.taskone.service.action;

import java.util.OptionalDouble;
import java.util.OptionalInt;


public interface SearchAction<T> {

    OptionalDouble searchAverageValue(T input);

    OptionalInt searchMaxValue(T input);

    OptionalInt searchMinValue(T input);

}
