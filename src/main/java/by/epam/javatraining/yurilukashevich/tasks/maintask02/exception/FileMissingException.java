package by.epam.javatraining.yurilukashevich.tasks.maintask02.exception;

public class FileMissingException extends Exception {

    public FileMissingException(Throwable e) {
        initCause(e);
    }
}


