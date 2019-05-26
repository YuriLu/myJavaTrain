package lesson03.task02;

import lesson03.serviceModule.Printer;

public class NumberLogic {
    public static void swapNumbers(int x, int y){
        Printer.print("Initial value for your variables is x = " + x + ", and y = " + y +".");
        x += y;
        y = x - y;
        x = x - y;
        Printer.print("We have swapped these values and now they are x = " + x + ", and y = " + y +".");
    }
}
