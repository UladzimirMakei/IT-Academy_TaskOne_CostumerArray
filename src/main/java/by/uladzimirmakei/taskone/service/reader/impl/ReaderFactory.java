package by.uladzimirmakei.taskone.service.reader.impl;

import by.uladzimirmakei.taskone.repository.exception.ArrayReaderException;
import by.uladzimirmakei.taskone.service.reader.ReaderAction;

public class ReaderFactory {

    public ReaderAction getReader(ReaderType type) throws ArrayReaderException {
        ReaderAction toReturn;
        switch (type) {
            case FILE:
                toReturn = new AllFileReader();
                break;
            case CONSOLE:
                toReturn = new ConsoleReader();
                break;
            default:
                throw new ArrayReaderException(
                        "Wrong ReaderAction type: " + type);
        }
        return toReturn;
    }
}
