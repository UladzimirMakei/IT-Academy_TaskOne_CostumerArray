package by.uladzimirmakei.taskone.repository.entity;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@ToString
public class Warehouse {

    private Map<Integer, MathParams> params;

    private Warehouse() {
        params = new HashMap<>();
    }

    private static class WarehouseHolder {
        private static final Warehouse WAREHOUSE = new Warehouse();
    }

    public static Warehouse getInstance() {
        return WarehouseHolder.WAREHOUSE;
    }

    public MathParams get(Object key) {
        return params.get(key);
    }

    public MathParams put(Integer key, MathParams value) {
        return params.put(key, value);
    }

}
