package by.uladzimirmakei.taskone.reader.impl;

import by.uladzimirmakei.taskone.exception.FileException;
import by.uladzimirmakei.taskone.reader.ReaderAction;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllFileReader implements ReaderAction<List<String>> {
    private static Logger logger = LogManager.getLogger();
    private static final String ARRAY_FILE_PATH = "data\\array.txt";

    @Override
    public List<String> read() throws FileException {
        logger.log(Level.DEBUG, "FileReader starts to read data from file {}", ARRAY_FILE_PATH);
        List<String> lineString = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARRAY_FILE_PATH))) {
            String line = reader.readLine();
            while (line != null) {
                lineString.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "FileReader unable to read data from file {} {}", ARRAY_FILE_PATH, e.getMessage());
            throw new FileException("FileReader unable to read data from file " + ARRAY_FILE_PATH, e);
        }
        logger.log(Level.DEBUG, "FileReader result is List {}", lineString);
        return lineString;
    }
}
