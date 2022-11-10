package by.uladzimirmakei.taskone.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MathParams {
    private int sum;
    private double averageValue;
    private int maxValue;
    private int minValue;

    public MathParams(MathParams params) {
        this.sum = params.getSum();
        this.averageValue = params.getAverageValue();
        this.maxValue = params.getMaxValue();
        this.minValue = params.getMinValue();
    }
}
