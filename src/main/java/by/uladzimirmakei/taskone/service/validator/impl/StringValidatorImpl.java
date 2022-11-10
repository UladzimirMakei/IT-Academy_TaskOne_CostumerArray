package by.uladzimirmakei.taskone.service.validator.impl;

import by.uladzimirmakei.taskone.service.validator.ValidateAction;

public class StringValidatorImpl implements ValidateAction<String> {
    private static final String STRING_NUMBER_REGEX = "[\\d+\\s?(.\\-,;)]+\\d+";

    @Override
    public boolean validate(String input) {
        return (!input.isEmpty()) && input.matches(STRING_NUMBER_REGEX);
    }
}
