package by.epam.javatraining.yurilukashevich.lesson03.task02;


import by.epam.javatraining.yurilukashevich.lesson03.serviceModule.Printer;

public class NumberLogic {
    public static void swapNumbers(int x, int y){
        Printer.print("\nInitial value for your variables is x = " + x + ", and y = " + y +".\n");
        x += y;
        y = x - y;
        x -= y;
        Printer.print("We have swapped these values and now they are x = " + x + ", and y = " + y +".\n");
    }
}
