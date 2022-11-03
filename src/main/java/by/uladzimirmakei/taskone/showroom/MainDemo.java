package by.uladzimirmakei.taskone.showroom;

import by.uladzimirmakei.taskone.creator.impl.RepositoryFromListCreator;
import by.uladzimirmakei.taskone.entity.CostumerArray;
import by.uladzimirmakei.taskone.exception.ArrayException;
import by.uladzimirmakei.taskone.exception.FileException;
import by.uladzimirmakei.taskone.exception.ListException;
import by.uladzimirmakei.taskone.entity.Warehouse;
import by.uladzimirmakei.taskone.reader.impl.AllFileReader;
import by.uladzimirmakei.taskone.reader.impl.ListReaderActionImpl;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import by.uladzimirmakei.taskone.repository.Specification;
import by.uladzimirmakei.taskone.repository.specifimpl.IdSpecification;
import by.uladzimirmakei.taskone.comparator.AverageIncreaseComparator;
import by.uladzimirmakei.taskone.writer.impl.RepositoryWriterImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class MainDemo {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.log(Level.DEBUG, "Start of program");
        AllFileReader reader = new AllFileReader();
        ArrayRepository arrayRepository = ArrayRepository.getInstance();
        try {
            List<String> fileList = reader.read();
            ListReaderActionImpl validator = new ListReaderActionImpl();
            List<String> validatedList = validator.read(fileList);
            RepositoryFromListCreator creator = new RepositoryFromListCreator();
            Warehouse warehouse = Warehouse.getInstance();
            creator.create(validatedList);
            logger.log(Level.DEBUG, "Full repository list {} {}", arrayRepository.getAll(), warehouse);
            Specification idSpecification = new IdSpecification(1);
            List<CostumerArray> resultSpec = arrayRepository.query(idSpecification);
            logger.log(Level.DEBUG, "Specification repository list {}", resultSpec);
            arrayRepository.sort(new AverageIncreaseComparator());
            logger.log(Level.DEBUG, "After increasing sorting repository list {}", arrayRepository.getAll());
            CostumerArray array = new CostumerArray(new int[]{1, 3, 5, 6, 7});
            array.setArrayElement(0, 5);
            array.observerOff();
            array.setArrayElement(0, 1);
            logger.log(Level.DEBUG, "Full repository list {} {}", array, warehouse.get(array.getId()));
            array.observerOn();
            logger.log(Level.DEBUG, "Full repository list {} {}", array, warehouse.get(array.getId()));
            RepositoryWriterImpl writer = new RepositoryWriterImpl();
            writer.write();
        } catch (FileException | ArrayException e) {
            logger.log(Level.ERROR, "File reader exception: {}", e.getMessage());
        } catch (ListException e) {
            logger.log(Level.ERROR, "Unable to create repository from list: {}", e.getMessage());
        }
        logger.log(Level.DEBUG, "End of program");
    }
}
