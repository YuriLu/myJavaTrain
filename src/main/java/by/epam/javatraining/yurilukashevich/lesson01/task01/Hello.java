package by.epam.javatraining.yurilukashevich.lesson01.task01;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Web");
        System.out.println(MisterX.msg);
    }

    static class MisterX {
        static final String msg = "I love apples";
    }
}
