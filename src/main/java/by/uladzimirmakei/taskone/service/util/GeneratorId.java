package by.uladzimirmakei.taskone.service.util;

public final class GeneratorId {
    private GeneratorId() {
    }

    private static int id = 1;

    public static int getId() {
        return id++;
    }
}
