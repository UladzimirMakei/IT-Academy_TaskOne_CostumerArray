package by.uladzimirmakei.taskone.service.creator.impl;

import by.uladzimirmakei.taskone.service.creator.CreatorAction;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.service.util.ArrayUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomValueCreator implements CreatorAction<int[]> {
    private static Logger logger = LogManager.getLogger();
    private static final int RANDOM_NUMBER = 15;
    private Random random = new Random();

    @Override
    public void create(int[] inputArray) throws ArrayException {
        if (!ArrayUtil.isArrayValid(inputArray)) {
            logger.log(Level.ERROR, "Unable to fill array with random data."
                    + " Invalid index or array is null");
            throw new ArrayException("Unable to fill array with random data."
                    + " Invalid index or array is null");
        }
        Arrays.stream(inputArray)
                .forEach(s -> s = random.nextInt(RANDOM_NUMBER));
    }
}
