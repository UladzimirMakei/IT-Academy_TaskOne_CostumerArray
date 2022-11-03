package by.uladzimirmakei.taskone.creator.impl;

import by.uladzimirmakei.taskone.creator.CreatorAction;
import by.uladzimirmakei.taskone.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

import static by.uladzimirmakei.taskone.util.ArrayUtil.*;

public class ArrayRandomValueCreator implements CreatorAction<int[]> {
    private static Logger logger = LogManager.getLogger();
    private Random random = new Random();

    @Override
    public void create(int[] inputArray) throws ArrayException {
        if (!isArrayValid(inputArray)) {
            logger.log(Level.ERROR, "Unable to fill array with random data. Invalid index or array is null");
            throw new ArrayException("Unable to fill array with random data. Invalid index or array is null");
        }
        Arrays.stream(inputArray)
                .forEach(s -> s = random.nextInt(15));
    }
}
