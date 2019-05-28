package by.epam.training.yurilukashevich.lesson01.task01;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Web");
        System.out.println(MisterX.msg);
    }

    static class MisterX {
        static String msg = "I love apples";
    }
}
