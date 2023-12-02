package ru.mirea.it.ivt;

public class badInnFormatException extends RuntimeException{
    public badInnFormatException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
