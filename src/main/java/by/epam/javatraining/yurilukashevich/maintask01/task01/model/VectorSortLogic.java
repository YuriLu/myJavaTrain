package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.apache.log4j.Logger;

/**
 * Class contains sort methods for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @since June 9, 2019
 */

public class VectorSortLogic {
    private static final Logger LOGGER = Logger.getLogger(VectorSortLogic.class);
    private static final String WARN_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static void bubbleSortUp(double[] array) {
        bubbleSort(array, true);
    }

    public static void bubbleSortDown(double[] array) {
        bubbleSort(array, false);
    }

    private static void bubbleSort(double[] array, boolean direction) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (direction ? array[j] > array[j + 1] : array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }
    }

    public static void insertionSort(double[] array) {
        insertionSort(array, true);
    }

    public static void insertionSortDown(double[] array) {
        insertionSort(array, false);
    }

    private static void insertionSort(double[] array, boolean direction) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }
        for (int i = 1; i < length; i++) {
            double element = array[i];
            int j = i;
            while (j > 0 && (direction ? array[j - 1] > element : array[j - 1] < element)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = element;
        }
    }

    public static void selectionSort(double[] array) {
        selectionSort(array, true);
    }

    public static void selectionSortDown(double[] array) {
        selectionSort(array, false);
    }

    private static void selectionSort(double[] array, boolean direction) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (direction ? array[j] < array[minIndex] : array[j] > array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, minIndex, i);
            }
        }
    }

    public static void mergeSort(double[] array) {
        int indexFirst = 0;
        int indexLast = array.length - 1;
        merge(array, indexFirst, indexLast, true);
    }

    public static void mergeSortDown(double[] array) {
        int indexFirst = 0;
        int indexLast = array.length - 1;
        merge(array, indexFirst, indexLast, false);
    }

    private static void merge(double[] array, int indexFirst, int indexLast, boolean direction) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }
        if (indexFirst < indexLast) {
            // Find the middle point
            int middleIndex = (indexFirst + indexLast) / 2;

            // Sort first and second halves
            merge(array, indexFirst, middleIndex, direction);
            merge(array, middleIndex + 1, indexLast, direction);

            // Find sizes of two sub arrays to be merged
            int sizeLeft = middleIndex - indexFirst + 1;
            int sizeRight = indexLast - middleIndex;

            /* Create temp arrays */
            double[] arrayLeft = new double[sizeLeft];
            double[] arrayRight = new double[sizeRight];

            /*Copy data to temp arrays*/
            for (int i = 0; i < sizeLeft; ++i) {
                arrayLeft[i] = array[indexFirst + i];
            }
            for (int j = 0; j < sizeRight; ++j) {
                arrayRight[j] = array[middleIndex + 1 + j];
            }
            /* Merge the temp arrays */
            // Initial indexes of first and second sub arrays
            int i = 0;
            int j = 0;

            // Initial index of merged sub array array
            int k = indexFirst;
            while (i < sizeLeft && j < sizeRight) {
                if (direction ? arrayLeft[i] <= arrayRight[j] : arrayLeft[i] >= arrayRight[j]) {
                    array[k] = arrayLeft[i];
                    i++;
                } else {
                    array[k] = arrayRight[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of arrayLeft[] if any */
            while (i < sizeLeft) {
                array[k] = arrayLeft[i];
                i++;
                k++;
            }

            /* Copy remaining elements of arrayRight[] if any */
            while (j < sizeRight) {
                array[k] = arrayRight[j];
                j++;
                k++;
            }
        }
    }

    public static void quickSort(double[] array) {
        int low = 0;
        int high = array.length - 1;
        quick(array, low, high, true);
    }

    public static void quickSortDown(double[] array) {
        int low = 0;
        int high = array.length - 1;
        quick(array, low, high, false);
    }

    private static void quick(double[] array, int low, int high, boolean direction) {
        int length = array.length;
        if (array == null || length == 0) {
            LOGGER.warn(WARN_MSG_ZERO);
            return;
        }
        if (low >= high) {
            return;     //end if nothing to divide
        }
        // pick the pivot
        double pivot = array[(low + high) / 2];

        // make left < pivot and right > pivot
        int i = low;
        int j = high;
        while (i <= j) {
            while (direction ? array[i] < pivot : array[i] > pivot) {
                i++;
            }
            while (direction ? array[j] > pivot : array[j] < pivot) {
                j--;
            }
            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quick(array, low, j, direction);
        }

        if (high > i) {
            quick(array, i, high, direction);
        }
    }

    private static void swap(double[] array, int indexOne, int indexTwo) {
        double temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}