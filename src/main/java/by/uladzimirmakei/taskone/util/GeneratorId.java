package by.uladzimirmakei.taskone.util;

public class GeneratorId {
    private GeneratorId() {
    }

    private static int id = 1;

    public static int getId() {
        return id++;
    }
}
