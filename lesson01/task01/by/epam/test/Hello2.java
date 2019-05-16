package by.epam.test;

public class Hello2 {
    public static void main(String[] args) {
        System.out.println("Hello Web");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " = " + args[i]);
        }
    }
}

// Компилируем с помощью команды
// c:\workdir>javac -d bin src\by\epam\test\Hello2.java   при этом должна быть папка bin в workdir
// -d это указание записать байт-код в папку bin

// Запускаем на выполнение с помощбю команды
// c:\workdir>java -cp ./bin by.epam.test.Hello2  при компиляции автоматом
// в папке bin создается путь указанный у нас как пакет

// можно запустить с параметрами после имени метода, тогда выведутся введенные параметры 
// c:\workdir>java -cp ./bin by.epam.test.Hello2 26 45 78