package by.uladzimirmakei.taskone.parser.impl;

import by.uladzimirmakei.taskone.parser.ParsingAction;

import java.util.Arrays;

public class ArrayParserImpl implements ParsingAction<String> {
    private static final String DELIMITER = "\\s+";
    private static final String PUNCTUATION_MARK = "[,;.-]";

    @Override
    public int[] parse(String inputString) {
        return Arrays.stream(inputString.replaceAll(PUNCTUATION_MARK, " ").split(DELIMITER))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
