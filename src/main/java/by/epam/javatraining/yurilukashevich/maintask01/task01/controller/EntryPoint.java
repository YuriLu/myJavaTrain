package by.epam.javatraining.yurilukashevich.maintask01.task01.controller;


import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.view.Printer;
import java.util.Random;

/**
 * Entry point for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @createdate June 9, 2019
 */

public class EntryPoint {
    private static final Random RANDOM = new Random();
    private static final double BOUND_FOR_ARRAY = 100.0; // array bound
    private static final String INITIAL_ARRAY = "\nInitial array:";


    public static void main(String[] args) {

        int arraySize = 6;

        final double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = RANDOM.nextDouble() * BOUND_FOR_ARRAY + 1;   // creates array from 1 till 100
        }

        Printer.print("\nCreate array of size = " + arraySize);
        Printer.printArray(array);

        Printer.print("\nMin element = " + VectorLogic.searchMin(array));
        Printer.print("\nMax element = " + VectorLogic.searchMax(array));

        Printer.print("\nArithmetical middle = " + VectorLogic.checkArithmeticalSum(array));
        Printer.print("\nGeometrical middle = " + VectorLogic.checkGeometricalSum(array));

        Printer.print("\nIs increasing elements array? --> " + VectorLogic.isIncreasing(array));
        Printer.print("\nIs decreasing elements array? --> " + VectorLogic.isDecreasing(array));

        Printer.print("\nFirst local min index is --> " + VectorLogic.localMinIndexSearch(array));
        Printer.print("\nFirst local max index is --> " + VectorLogic.localMaxIndexSearch(array));

        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 15.3;
        int low = 0;
        int high = 4;

        Printer.print(INITIAL_ARRAY);
        Printer.printArray(array);
        Printer.print("\nLinear search for key = " + numberToFind + " Index is = " + VectorLogic.linearSearch(arr, numberToFind));
        Printer.print("\nBinary search for key = " + numberToFind + " Index is = " + VectorLogic.binarySearch(arr, numberToFind, low, high));

        Printer.print(INITIAL_ARRAY);
        Printer.printArray(array);
        Printer.print("\nReversed array:");
        VectorLogic.reverseArray(array);
        Printer.printArray(array);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nInsertion sort");
        Printer.print(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.insertionSort(arr);
        Printer.print("\nSorted by insertion array:");
        Printer.printArray(arr);


        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nSelection sort");
        Printer.print(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.selectionSort(arr);
        Printer.print("\nSorted by selection array:");
        Printer.printArray(arr);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nMerge sort");
        Printer.print(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.mergeSort(arr);
        Printer.print("\nSorted by merge array:");
        Printer.printArray(arr);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nQuick sort");
        Printer.print(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.quickSort(arr);
        Printer.print("\nSorted by quick array:");
        Printer.printArray(arr);
    }
}
