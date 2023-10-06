package ru.mirea.it.ivt;

public class Processor {
    private int numOfCores;
    private int numOfThreads;
    private int clock;

    public Processor(int numOfCores, int numOfThreads, int clock) {
        this.numOfCores = numOfCores;
        this.numOfThreads = numOfThreads;
        this.clock = clock;
    }

    @Override
    public String toString(){
        return "Num of cores - " + this.numOfCores + ", num of threads - " + this.numOfThreads +
                ", clock - " + this.clock;
    }
}
