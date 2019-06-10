package by.epam.javatraining.yurilukashevich.maintask01.task01.controller;


import by.epam.javatraining.yurilukashevich.maintask01.task01.model.VectorLogic;
import by.epam.javatraining.yurilukashevich.maintask01.task01.view.Printer;
import org.apache.log4j.Logger;
import java.util.Random;

/**
 * Entry point for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * June 9, 2019
 */

public class EntryPoint {
    private static final Logger LOGGER = Logger.getLogger(EntryPoint.class);
    private static final Random RANDOM = new Random();
    private static final double BOUND_FOR_ARRAY = 100.0; // array bound
    private static final String INITIAL_ARRAY = "\nInitial array:";


    public static void main(String[] args) {

        int arraySize = 6;

        final double[] array = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = RANDOM.nextDouble() * BOUND_FOR_ARRAY + 1;   // creates array from 1 till 100
        }


        LOGGER.info("\nCreate array of size = " + arraySize);
        Printer.printArray(array);

        LOGGER.info("\nMin element = " + VectorLogic.searchMin(array));
        LOGGER.info("\nMax element = " + VectorLogic.searchMax(array));

        LOGGER.info("\nArithmetical middle = " + VectorLogic.checkArithmeticalSum(array));
        LOGGER.info("\nGeometrical middle = " + VectorLogic.checkGeometricalSum(array));

        LOGGER.info("\nIs increasing elements array? --> " + VectorLogic.isIncreasing(array));
        LOGGER.info("\nIs decreasing elements array? --> " + VectorLogic.isDecreasing(array));

        LOGGER.info("\nFirst local min index is --> " + VectorLogic.localMinIndexSearch(array));
        LOGGER.info("\nFirst local max index is --> " + VectorLogic.localMaxIndexSearch(array));

        double[] arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        double numberToFind = 15.3;
        int low = 0;
        int high = 4;

        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(array);
        LOGGER.info("\nLinear search for key = " + numberToFind + " Index is = " + VectorLogic.linearSearch(arr, numberToFind));
        LOGGER.info("\nBinary search for key = " + numberToFind + " Index is = " + VectorLogic.binarySearch(arr, numberToFind, low, high));

        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(array);
        LOGGER.info("\nReversed array:");
        VectorLogic.reverseArray(array);
        Printer.printArray(array);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        LOGGER.info("\nInsertion sort");
        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.insertionSort(arr);
        LOGGER.info("\nSorted by insertion array:");
        Printer.printArray(arr);


        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        LOGGER.info("\nSelection sort");
        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.selectionSort(arr);
        LOGGER.info("\nSorted by selection array:");
        Printer.printArray(arr);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        LOGGER.info("\nMerge sort");
        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.mergeSort(arr);
        LOGGER.info("\nSorted by merge array:");
        Printer.printArray(arr);

        arr = new double[]{15.9, 19.7, 15.3, 14.25, 4.5};
        LOGGER.info("\nQuick sort");
        LOGGER.info(INITIAL_ARRAY);
        Printer.printArray(arr);
        VectorLogic.quickSort(arr);
        LOGGER.info("\nSorted by quick array:");
        Printer.printArray(arr);
    }
}
