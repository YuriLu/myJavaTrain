package by.epam.javatraining.yurilukashevich.maintask01.task01.view;

import org.apache.log4j.Logger;

/**
 * Class contains methods for output data to console.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 9, 2019
 */

public class Printer {
    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(Printer.class);

    public static void print(String msg) {
        LOGGER.info(msg);
    }

}