package by.epam.maintask2array.exception;

public class FileMissingException extends Exception {

    public FileMissingException(Throwable e) {
        initCause(e);
    }
}


