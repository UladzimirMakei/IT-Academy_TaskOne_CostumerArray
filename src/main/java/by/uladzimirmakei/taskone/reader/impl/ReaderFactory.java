package by.uladzimirmakei.taskone.reader.impl;

import by.uladzimirmakei.taskone.exception.ArrayReaderException;
import by.uladzimirmakei.taskone.reader.ReaderAction;

public class ReaderFactory {

    public ReaderAction getReader(ReaderType type) throws ArrayReaderException {
        ReaderAction toReturn;
        switch (type) {
            case FILE -> toReturn = new AllFileReader();
            case CONSOLE -> toReturn = new ConsoleReader();
            default -> throw new ArrayReaderException("Wrong ReaderAction type: " + type);
        }
        return toReturn;
    }
}
