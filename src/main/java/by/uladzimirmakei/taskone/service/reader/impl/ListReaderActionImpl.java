package by.uladzimirmakei.taskone.service.reader.impl;

import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.service.reader.ListReaderAction;
import by.uladzimirmakei.taskone.service.validator.impl.StringValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.stream.Collectors;

public class ListReaderActionImpl implements ListReaderAction<List<String>> {
    private static Logger logger = LogManager.getLogger();

    @Override
    public List<String> read(List<String> inputData) throws ListException {
        logger.log(Level.DEBUG, "Validator in use with List {}", inputData);
        if (inputData.isEmpty()) {
            logger.log(Level.ERROR, "Input list to validate is empty");
            throw new ListException("Input list to validate is empty");
        }
        StringValidatorImpl stringValidator = new StringValidatorImpl();
        List<String> readList = inputData.stream()
                .filter(stringValidator::validate)
                .collect(Collectors.toList());
        logger.log(Level.DEBUG, "List after validation {}", readList);
        return readList;
    }
}
