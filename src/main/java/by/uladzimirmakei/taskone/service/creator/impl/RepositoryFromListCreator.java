package by.uladzimirmakei.taskone.service.creator.impl;

import by.uladzimirmakei.taskone.service.creator.CreatorAction;
import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.service.parser.impl.ArrayParserImpl;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class RepositoryFromListCreator implements CreatorAction<List<String>> {
    private static Logger logger = LogManager.getLogger();

    @Override
    public void create(List<String> stringList)
            throws ArrayException, ListException {
        if (stringList.isEmpty()) {
            throw new ListException("Input list is empty.");
        }
        ArrayRepository arrayRepository = ArrayRepository.getInstance();
        ArrayParserImpl parser = new ArrayParserImpl();
        for (String line : stringList) {
            int[] parsedArray = parser.parse(line);
            try {
                CostumerArray array = new CostumerArray(parsedArray);
                arrayRepository.add(array);
            } catch (ArrayException e) {
                logger.log(Level.ERROR,
                        "Repository creator unable to create array {}",
                        Arrays.toString(parsedArray));
                throw new ArrayException(
                        "Unable to create array in Repository creator", e);
            }
        }
    }
}
