package by.uladzimirmakei.taskone.service.action.impl;

import by.uladzimirmakei.taskone.service.action.ChangeAction;

import java.util.Arrays;

public class ChangeActionImpl implements ChangeAction {

    @Override
    public void changeAllToZero(int[] array) {
        Arrays.fill(array, 0);
    }

    @Override
    public void changePositiveToNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                array[i] *= -1;
            }
        }
    }

    @Override
    public void changeEvenToOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            }
        }
    }
}
