package by.uladzimirmakei.taskone.writer.impl;

import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.exception.FileException;
import by.uladzimirmakei.taskone.entity.Warehouse;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import by.uladzimirmakei.taskone.writer.RepositoryWriter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;

public class RepositoryWriterImpl implements RepositoryWriter {
    private static Logger logger = LogManager.getLogger();
    private static final String RESULT_FILE_PATH = "data\\result.txt";

    @Override
    public void write() throws FileException {
        logger.log(Level.DEBUG, "RepositoryWriter writing result to file {}", RESULT_FILE_PATH);
        ArrayRepository repository = ArrayRepository.getInstance();
        Warehouse warehouse = Warehouse.getInstance();
        List<CostumerArray> writeList = repository.getAll();
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(RESULT_FILE_PATH)))) {
            for (CostumerArray array : writeList) {
                writer.println(array.toString() + " " + warehouse.get(array.getId()));
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "RepositoryWriter unable to write data to file {} {}", RESULT_FILE_PATH, e.getMessage());
            throw new FileException("RepositoryReader unable to read data from file " + RESULT_FILE_PATH, e);
        }
    }
}
