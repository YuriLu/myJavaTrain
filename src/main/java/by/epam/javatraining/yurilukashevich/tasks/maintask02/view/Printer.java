package by.epam.javatraining.yurilukashevich.tasks.maintask02.view;

import org.apache.log4j.Logger;

/**
 * Class contains methods for output data to console.
 *
 * @author Yuri Lukashevich
 * @version 1.0
 * @since June 16, 2019
 */

public class Printer {
    private static final Logger LOGGER = Logger.getLogger(Printer.class);

    public static void print(String msg) {
        LOGGER.info(msg);
    }

}