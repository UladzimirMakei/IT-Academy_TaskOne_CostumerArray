package by.uladzimirmakei.taskone.service.util;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.repository.exception.FileException;
import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import by.uladzimirmakei.taskone.repository.specifimpl.Specification;
import by.uladzimirmakei.taskone.service.creator.impl.RepositoryFromListCreator;
import by.uladzimirmakei.taskone.service.reader.impl.AllFileReader;
import by.uladzimirmakei.taskone.service.reader.impl.ListReaderActionImpl;
import by.uladzimirmakei.taskone.service.writer.impl.RepositoryWriterImpl;

import java.util.List;

public class FileUtil {
    private FileUtil() {
    }

    public static List<String> readFromFile() throws FileException {
        AllFileReader reader = new AllFileReader();
        return reader.read();
    }

    public static List<String> validateList(List<String> listBeforeValidation)
            throws ListException {
        ListReaderActionImpl validator = new ListReaderActionImpl();
        return validator.read(listBeforeValidation);
    }

    public static void writeResultToFile() throws FileException {
        RepositoryWriterImpl writer = new RepositoryWriterImpl();
        writer.write();
    }

    public static void createRepositoryFromList(
            List<String> listToCreateRepository)
            throws ArrayException, ListException {
        RepositoryFromListCreator creator = new RepositoryFromListCreator();
        creator.create(listToCreateRepository);
    }

    public static List<CostumerArray>
    createListFromRepositoryWithSpecification(
            Specification specification) {
        ArrayRepository arrayRepository = ArrayRepository.getInstance();
        return arrayRepository.query(specification);
    }
}
