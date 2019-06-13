package by.epam.javatraining.yurilukashevich.maintask01.addunit.controller;


import by.epam.javatraining.yurilukashevich.maintask01.addunit.model.MatrixLogic;
import by.epam.javatraining.yurilukashevich.maintask01.addunit.view.Printer;
import org.apache.log4j.Logger;

import java.util.Random;

/**
 * Entry point for processing matrix N*M.
 *
 * @author Yuri Lukashevich
 * @version 1.1
 * @createdate June 10, 2019
 */

public class EntryPoint {
    private static final Logger LOGGER = Logger.getLogger(EntryPoint.class);
    private static final Random RANDOM = new Random();
    private static final int BOUND_FOR_ARRAY = 50; // array bound


    public static void main(String[] args) {
        int arraySizeN = 4;
        int arraySizeM = 3;

        int[][] array = new int[arraySizeN][arraySizeM];

        for (int i = 0; i < arraySizeN; i++) {
            for (int j = 0; j < arraySizeM; j++) {
                array[i][j] = RANDOM.nextInt(BOUND_FOR_ARRAY) + 1;   // creates array from 1 till 100
            }
        }

        Printer.print("\nCreate matrix of size = [" + arraySizeN + "," + arraySizeM + "]");
        Printer.printArray(array);

        Printer.print("\nMin element = " + MatrixLogic.searchMin(array));
        Printer.print("\nMax element = " + MatrixLogic.searchMax(array));
        Printer.print("\nIs symmetric(square)? --> " + MatrixLogic.isSymmetric(array));
        Printer.print("\nIs symmetric by diagonal? --> " + MatrixLogic.isSymmetricByDiagonal(array) + "\n");

        array = new int[][]{{2, 34, 42}, {17, 9, 28}, {35, 37, 3}};
        Printer.printArray(array);

        Printer.print("\nFirst local Min is " + MatrixLogic.localMinSearch(array) + "\n");
        Printer.print("\nFirst local Max is " + MatrixLogic.localMaxSearch(array) + "\n");

        Printer.print("\nTranspose matrix:");
        MatrixLogic.transpose(array);
        Printer.printArray(array);

    }
}
