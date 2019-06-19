package by.epam.javatraining.yurilukashevich.maintask01.task01.controller;


import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorArithmeticLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorSearchLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorSortLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.view.Printer;

import java.util.Arrays;
import java.util.Random;

/**
 * Entry point for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 9, 2019
 */

public class EntryPoint {
    private static final Random RANDOM = new Random();
    private static final double BOUND_FOR_ARRAY = 100.0; // array bound
    private static final String INITIAL_ARRAY = "\nInitial array:";

    public static void main(String[] args) {

        int arraySize = 6;

        final double[] arrayOne = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayOne[i] = RANDOM.nextDouble() * BOUND_FOR_ARRAY + 1;   // creates array from 1 till 100
        }

        Printer.print("\nCreate array of size = " + arraySize);
        Printer.print("\nArray = " + Arrays.toString(arrayOne) + "\n");

        Printer.print("\nMin element = " + VectorSearchLogic.searchMin(arrayOne));
        Printer.print("\nMax element = " + VectorSearchLogic.searchMax(arrayOne));

        Printer.print("\nArithmetical middle = " + VectorArithmeticLogic.checkArithmeticalSum(arrayOne));
        Printer.print("\nGeometrical middle = " + VectorArithmeticLogic.checkGeometricalSum(arrayOne));

        Printer.print("\nIs increasing elements array? --> " + VectorLogic.isIncreasing(arrayOne));
        Printer.print("\nIs decreasing elements array? --> " + VectorLogic.isDecreasing(arrayOne));

        Printer.print("\nFirst local min index is --> " + VectorSearchLogic.localMinIndexSearch(arrayOne));
        Printer.print("\nFirst local max index is --> " + VectorSearchLogic.localMaxIndexSearch(arrayOne));

        double[] array = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 15.3;
        int low = 0;
        int high = 4;

        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        Printer.print("\nLinear search for key = " + numberToFind + " Index is = " + VectorSearchLogic.linearSearch(array, numberToFind));
        Printer.print("\nBinary search for key = " + numberToFind + " Index is = " + VectorSearchLogic.binarySearch(array, numberToFind, low, high));

        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        Printer.print("\nReversed array:");
        VectorArithmeticLogic.reverseArray(array);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");

        array = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nInsertion sort");
        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        VectorSortLogic.insertionSort(array);
        Printer.print("\nSorted by insertion array:");
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");

        array = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nSelection sort");
        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        VectorSortLogic.selectionSort(array);
        Printer.print("\nSorted by selection array:");
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");

        array = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nMerge sort");
        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        VectorSortLogic.mergeSort(array);
        Printer.print("\nSorted by merge array:");
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");

        array = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        Printer.print("\nQuick sort");
        Printer.print(INITIAL_ARRAY);
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
        VectorSortLogic.quickSort(array);
        Printer.print("\nSorted by quick array:");
        Printer.print("\nArray = " + Arrays.toString(array) + "\n");
    }
}
