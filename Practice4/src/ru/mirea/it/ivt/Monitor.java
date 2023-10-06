package ru.mirea.it.ivt;

public class Monitor {
    int resolution;
    int diagonal;

    public Monitor(int resolution, int diagonal) {
        this.resolution = resolution;
        this.diagonal = diagonal;
    }

    @Override
    public String toString(){
        return "Resolution - " + this.resolution + ", diagonal - " + this.diagonal;
    }
}
