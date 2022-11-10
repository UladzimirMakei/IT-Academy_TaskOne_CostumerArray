package by.uladzimirmakei.taskone.service.util;

import by.uladzimirmakei.taskone.repository.entity.CostumerArray;
import by.uladzimirmakei.taskone.repository.exception.ArrayException;
import by.uladzimirmakei.taskone.repository.exception.ArrayReaderException;
import by.uladzimirmakei.taskone.repository.exception.FileException;
import by.uladzimirmakei.taskone.repository.exception.ListException;
import by.uladzimirmakei.taskone.repository.repositoryimpl.ArrayRepository;
import by.uladzimirmakei.taskone.repository.specifimpl.Specification;
import by.uladzimirmakei.taskone.service.creator.impl.RepositoryFromListCreator;
import by.uladzimirmakei.taskone.service.reader.ReaderAction;
import by.uladzimirmakei.taskone.service.reader.impl.ReaderFactory;
import by.uladzimirmakei.taskone.service.reader.impl.ReaderType;
import by.uladzimirmakei.taskone.service.validator.impl.ListValidatorActionImpl;
import by.uladzimirmakei.taskone.service.writer.impl.RepositoryWriterImpl;

import java.util.List;

public class FileUtil {
    private FileUtil() {
    }

    public static List<String> readFromFile()
            throws FileException, ArrayReaderException {
        ReaderAction<List<String>> reader =
                ReaderFactory.createReader(ReaderType.FILE);
        return reader.read();
    }

    public static List<String> validateList(List<String> listBeforeValidation)
            throws ListException {
        ListValidatorActionImpl validator = new ListValidatorActionImpl();
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
