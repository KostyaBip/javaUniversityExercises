package ru.mirea.it.ivt;

public class Memory {
    private int clock;
    private int generation;
    private int amount;

    public Memory(int clock, int generation, int amount) {
        this.clock = clock;
        this.generation = generation;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Amount in GB - " + this.amount + ", generation - ddr" + this.generation +
                ", clock - " + this.clock;
    }
}
