package by.epam.javatraining.yurilukashevich.maintask01.task01.model;

import org.apache.log4j.Logger;

/**
 * Class contains methods for processing arrays.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * June 9, 2019
 */

public class VectorLogic {
    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);
    private static final String ERR_MSG_ZERO = "Incorrect initial size of array. It should be greater than zero.";

    public static double searchMin(double[] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1.0;
        }
        double min = arr[0];
        for (int i = 1; i < length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double searchMax(double[] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1.0;
        }
        double max = arr[0];

        for (int i = 1; i < length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double checkArithmeticalSum(double[] arr) {
        double sum = 0.0;
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1.0;
        }

        for (double element : arr) {
            sum += element;
        }
        return sum / length;
    }

    public static double checkGeometricalSum(double[] arr) {
        double result = 1.0;
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1.0;
        }
        double rootDegree = 1.0 / length;

        for (double element : arr) {
            result *= element;
        }
        return Math.pow(result, rootDegree);
    }

    public static boolean isIncreasing(double[] arr) {
        int length = arr.length;
        if (length < 2) {
            LOGGER.info("Array has not enough element to determine order.");
            return false;
        }
        boolean result = true;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = false;
            }
        }
        return result;
    }

    public static boolean isDecreasing(double[] arr) {
        int length = arr.length;
        if (length < 2) {
            LOGGER.info("Array has not enough element to determine order.");
            return false;
        }
        boolean result = true;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                result = false;
            }
        }
        return result;
    }

    public static int localMinIndexSearch(double[] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int localMaxIndexSearch(double[] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(double[] arr, double numberToFind) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        }

        for (int i = 0; i < length; i++) {
            if (arr[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(double[] arr, double numberToFind, int lowIndex, int highIndex) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return -1;
        } else {
            selectionSort(arr);
        }

        if (highIndex < lowIndex) {
            LOGGER.error("High index is lower than low index");
            return -1;
        }
        if (highIndex > length) {
            LOGGER.error("High index is out of range. It should be no larger than arr.length");
            return -1;
        }

        int middleIndex = (lowIndex + highIndex) / 2;

        if (numberToFind == arr[middleIndex]) {
            return middleIndex;
        } else if (numberToFind < arr[middleIndex]) {
            return binarySearch(arr, numberToFind, lowIndex, middleIndex - 1);
        } else {
            return binarySearch(arr, numberToFind, middleIndex + 1, highIndex);
        }
    }

    public static void reverseArray(double[] arr) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }

        for (int i = 0; i < length / 2; i++) {
            swap(arr, i, length - 1 - i);
        }
    }

    public static void bubbleSortUp(double[] arr) {
        bubbleSort(arr, true);
    }

    public static void bubbleSortDown(double[] arr) {
        bubbleSort(arr, false);
    }

    private static void bubbleSort(double[] arr, boolean direction) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (direction ? arr[j] > arr[j + 1] : arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }
    }

    public static void insertionSort(double[] arr) {
        insertionSort(arr, true);
    }

    public static void insertionSortDown(double[] arr) {
        insertionSort(arr, false);
    }

    private static void insertionSort(double[] arr, boolean direction) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }

        for (int i = 1; i < length; i++) {
            double element = arr[i];
            int j = i;
            while (j > 0 && (direction ? arr[j - 1] > element : arr[j - 1] < element)) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = element;
        }
    }

    public static void selectionSort(double[] arr) {
        selectionSort(arr, true);
    }

    public static void selectionSortDown(double[] arr) {
        selectionSort(arr, false);
    }

    private static void selectionSort(double[] arr, boolean direction) {
        int length = arr.length;
        if (length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (direction ? arr[j] < arr[minIndex] : arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
        }
    }

    public static void mergeSort(double[] arr) {
        int indexFirst = 0;
        int indexLast = arr.length - 1;
        merge(arr, indexFirst, indexLast, true);
    }

    public static void mergeSortDown(double[] arr) {
        int indexFirst = 0;
        int indexLast = arr.length - 1;
        merge(arr, indexFirst, indexLast, false);
    }

    private static void merge(double[] arr, int indexFirst, int indexLast, boolean direction) {
        if (arr.length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }
        if (indexFirst < indexLast) {
            // Find the middle point
            int middleIndex = (indexFirst + indexLast) / 2;

            // Sort first and second halves
            merge(arr, indexFirst, middleIndex, direction);
            merge(arr, middleIndex + 1, indexLast, direction);

            // Find sizes of two sub arrays to be merged
            int sizeLeft = middleIndex - indexFirst + 1;
            int sizeRight = indexLast - middleIndex;

            /* Create temp arrays */
            double[] arrayLeft = new double[sizeLeft];
            double[] arrayRight = new double[sizeRight];

            /*Copy data to temp arrays*/
            for (int i = 0; i < sizeLeft; ++i) {
                arrayLeft[i] = arr[indexFirst + i];
            }
            for (int j = 0; j < sizeRight; ++j) {
                arrayRight[j] = arr[middleIndex + 1 + j];
            }
            /* Merge the temp arrays */
            // Initial indexes of first and second sub arrays
            int i = 0;
            int j = 0;

            // Initial index of merged sub array array
            int k = indexFirst;
            while (i < sizeLeft && j < sizeRight) {
                if (direction ? arrayLeft[i] <= arrayRight[j] : arrayLeft[i] >= arrayRight[j]) {
                    arr[k] = arrayLeft[i];
                    i++;
                } else {
                    arr[k] = arrayRight[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of arrayLeft[] if any */
            while (i < sizeLeft) {
                arr[k] = arrayLeft[i];
                i++;
                k++;
            }

            /* Copy remaining elements of arrayRight[] if any */
            while (j < sizeRight) {
                arr[k] = arrayRight[j];
                j++;
                k++;
            }
        }
    }

    public static void quickSort(double[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quick(arr, low, high, true);
    }

    public static void quickSortDown(double[] arr) {
        int low = 0;
        int high = arr.length - 1;
        quick(arr, low, high, false);
    }

    private static void quick(double[] arr, int low, int high, boolean direction) {
        if (arr == null || arr.length == 0) {
            LOGGER.error(ERR_MSG_ZERO);
            return;
        }
        if (low >= high) {
            return;     //end if nothing to divide
        }
        // pick the pivot
        double pivot = arr[(low + high) / 2];

        // make left < pivot and right > pivot
        int i = low;
        int j = high;
        while (i <= j) {
            while (direction ? arr[i] < pivot : arr[i] > pivot) {
                i++;
            }
            while (direction ? arr[j] > pivot : arr[j] < pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j) {
            quick(arr, low, j, direction);
        }

        if (high > i) {
            quick(arr, i, high, direction);
        }
    }

    private static void swap(double[] arr, int indexOne, int indexTwo) {
        double temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}