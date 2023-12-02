package ru.mirea.it.ivt;

public class badInnImpressionException extends Exception{
    public badInnImpressionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
