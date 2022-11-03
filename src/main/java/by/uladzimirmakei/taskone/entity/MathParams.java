package by.uladzimirmakei.taskone.entity;

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

    public MathParams(int sum, double averageValue, int maxValue, int minValue) {
        this.sum = sum;
        this.averageValue = averageValue;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public int getSum() {
        return sum;
    }

    public double getAverageValue() {
        return averageValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMathParams(MathParams params) {
        this.sum = params.getSum();
        this.averageValue = params.getAverageValue();
        this.maxValue = params.getMaxValue();
        this.minValue = params.getMinValue();
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAverageValue(double averageValue) {
        this.averageValue = averageValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    @Override
    public String toString() {
        return new StringBuilder("MathParams{" +
                "sum=" + sum +
                ", averageValue=" + averageValue +
                ", maxValue=" + maxValue +
                ", minValue=" + minValue +
                '}').toString();
    }
}
