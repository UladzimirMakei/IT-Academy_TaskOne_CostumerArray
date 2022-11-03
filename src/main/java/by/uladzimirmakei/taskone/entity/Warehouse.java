package by.uladzimirmakei.taskone.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<Integer, MathParams> params = new HashMap<>();

    private Warehouse() {
    }

    private static class WarehouseHolder {
        private static final Warehouse WAREHOUSE = new Warehouse();
    }

    public static Warehouse getInstance() {
        return WarehouseHolder.WAREHOUSE;
    }

    public int size() {
        return params.size();
    }

    public MathParams get(Object key) {
        return params.get(key);
    }

    public MathParams put(Integer key, MathParams value) {
        return params.put(key, value);
    }

    public void putAll(Map<Integer, MathParams> m) {
        params.putAll(m);
    }

    @Override
    public String toString() {
        return new StringBuilder("Warehouse{" +
                "summa=" + params +
                '}').toString();
    }
}
