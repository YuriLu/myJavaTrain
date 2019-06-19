package by.epam.javatraining.yurilukashevich.maintask01;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

/**
 * Class describes My Array.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 18, 2019
 */

public class MyArray {
    private static final Logger LOGGER = Logger.getLogger(MyArray.class);
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 1_000_000_000;
    private int[] array;
    private int elementsInArray;
    private int capacity;

    public MyArray() {
        capacity =  DEFAULT_SIZE;
        array = new int[capacity];
        elementsInArray = 0;
        LOGGER.info("Array created with default size " + DEFAULT_SIZE);
    }


    public MyArray(int size) {
        this();
        if (size > capacity) {
            array = new int[size];
            elementsInArray = 0;
        }
        LOGGER.info("Array created with size " + size);
    }

    public int sizeOf() {
        return elementsInArray;
    }

    public void add(int value) {
        if (elementsInArray == capacity) {
            increaseArray();
        }
        array[elementsInArray] = value;
        elementsInArray++;
        LOGGER.info("Added new element " + value + " at position " + elementsInArray);
    }

    public int get(int index) {
        int element = -1;
        if (checkIndex(index)) {
            element = array[index];
        }
        return element;
    }

    public void set(int index, int value) {
        if (checkIndex(index)) {
            array[index] = value;
            LOGGER.info("Set new value " + value + " for element with index " + index);
        }
    }

    private void increaseArray() {
        if (capacity > MAX_SIZE / 3) {
            LOGGER.warn("Max value has reached for Array capacity");
            return;
        }
        int newSize = capacity * 2 - 10;
        int[] newArray = new int[newSize];
        for (int i = 0; i < elementsInArray; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        LOGGER.info("Set new size for array " + newSize);
    }


    private boolean checkIndex(int index) {
        if (index < 0 || index >= elementsInArray) {
            LOGGER.error("ArrayIndexOutOfBounds");
            return false;
        }
        return true;
    }

    public void swap(int index1, int index2) {
        if (checkIndex(index1) && checkIndex(index2)) {
            int buffer = array[index1];
            array[index1] = array[index2];
            array[index2] = buffer;
        }
}

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < elementsInArray; i++) {
            str.append(array[i] + " ");
        }
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyArray)) return false;
        MyArray myArray = (MyArray) o;
        return elementsInArray == myArray.elementsInArray &&
                Arrays.equals(array, myArray.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(elementsInArray);
        result = 28 * result + Arrays.hashCode(array);
        return result;
    }
}