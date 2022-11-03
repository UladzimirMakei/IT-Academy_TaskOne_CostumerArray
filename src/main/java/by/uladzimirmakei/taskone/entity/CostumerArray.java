package by.uladzimirmakei.taskone.entity;

import by.uladzimirmakei.taskone.exception.ArrayException;
import by.uladzimirmakei.taskone.listener.impl.WarehouseObserverImp;
import by.uladzimirmakei.taskone.util.GeneratorId;

import java.util.Arrays;

import static by.uladzimirmakei.taskone.util.ArrayUtil.*;

public class CostumerArray implements WarehouseListener {
    private int id;
    private int[] array;
    private WarehouseObserverImp observer;
    private boolean observerMode;

    public CostumerArray() {
        super();
        observer = new WarehouseObserverImp();
        observerMode = true;
    }

    public CostumerArray(int[] array) throws ArrayException {
        if (!isArrayValid(array)) {
            throw new ArrayException("Array is null or array's length is invalid");
        }
        this.array = array;
        this.id = GeneratorId.getId();
        observer = new WarehouseObserverImp();
        observerMode = true;
        listen(this);
    }

    public CostumerArray(int arrayLength) throws ArrayException {
        if (arrayLength <= 0) {
            throw new ArrayException("Invalid array length");
        }
        this.array = new int[arrayLength];
        this.id = GeneratorId.getId();
        observer = new WarehouseObserverImp();
        observerMode = true;
        listen(this);
    }

    public int getArrayElement(int elementIndex) throws ArrayException {
        if (!isIndexAndArrayValid(array, elementIndex)) {
            throw new ArrayException("Invalid index or array is null");
        }
        return this.array[elementIndex];
    }

    public void setArrayElement(int elementIndex, int value) throws ArrayException {
        if (!isIndexAndArrayValid(array, elementIndex)) {
            throw new ArrayException("Invalid index or array is null");
        }
        this.array[elementIndex] = value;
        listen(this);
    }

    public int getId() {
        return id;
    }

    public int[] getArray() {
        return this.array;
    }

    public void setArray(int[] array) throws ArrayException {
        if (!isArrayValid(array)) {
            throw new ArrayException("Array is null or array's length is invalid");
        }
        this.array = array;
        listen(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CostumerArray that = (CostumerArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return new StringBuilder("CostumerArray {" +
                "array=" + Arrays.toString(array) +
                '}').toString();
    }

    @Override
    public void observerOn() {
        observerMode = true;
        listen(this);
    }

    @Override
    public void observerOff() {
        observerMode = false;
    }

    private void listen(CostumerArray array) {
        if (observerMode) {
            observer.update(array);
        }
    }
}
