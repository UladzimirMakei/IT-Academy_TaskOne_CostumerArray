package by.uladzimirmakei.taskone;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.entity.Warehouse;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.repository.exception.FileException;
import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import by.uladzimirmakei.taskone.repository.specifimpl.IdSpecification;
import by.uladzimirmakei.taskone.service.comparator.ArrayComparator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static by.uladzimirmakei.taskone.service.util.FileUtil.*;

public class MainDemo {
    private MainDemo() {
    }

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.log(Level.DEBUG, "Start of program");
        try {
            List<String> fileList = readFromFile();
            List<String> validatedList = validateList(fileList);
            createRepositoryFromList(validatedList);
            ArrayRepository arrayRepository = ArrayRepository.getInstance();
            Warehouse warehouse = Warehouse.getInstance();
            logger.log(Level.DEBUG, "Full repository list {} {}",
                    arrayRepository.getAll(), warehouse);
            List<CostumerArray> resultSpec =
                    createListFromRepositoryWithSpecification(
                    new IdSpecification(1));
            logger.log(Level.DEBUG, "Specification repository list {}",
                    resultSpec);
            arrayRepository.sort(ArrayComparator.AVERAGE_INCREASE);
            logger.log(Level.DEBUG,
                    "After increasing sorting repository list {}",
                    arrayRepository.getAll());
            writeResultToFile();
        } catch (FileException | ArrayException e) {
            logger.log(Level.ERROR, "File reader exception: {}",
                    e.getMessage());
        } catch (ListException e) {
            logger.log(Level.ERROR, "Unable to create repository from list: {}",
                    e.getMessage());
        }
        logger.log(Level.DEBUG, "End of program");
    }
}
