package by.uladzimirmakei.taskone.validator.impl;

import by.uladzimirmakei.taskone.validator.ValidateAction;

public class StringValidatorImpl implements ValidateAction<String> {
    private static final String STRING_NUMBER_REGEX = "[\\d+\\s?(.\\-,;)]+\\d+";

    @Override
    public boolean validate(String input) {
        boolean result = false;
        if (!input.isEmpty()) {
            result = input.matches(STRING_NUMBER_REGEX);
        }
        return result;
    }
}
