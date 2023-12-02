package ru.mirea.it.ivt;

public class genericClassOne<T, V, K> {
    private T firstVar;
    private V secondVar;
    private K thirdVar;

    public genericClassOne(T firstVar, V secondVar, K thirdVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
    }

    public T getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(T firstVar) {
        this.firstVar = firstVar;
    }

    public V getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(V secondVar) {
        this.secondVar = secondVar;
    }

    public K getThirdVar() {
        return thirdVar;
    }

    public void setThirdVar(K thirdVar) {
        this.thirdVar = thirdVar;
    }

    public String toString() {
        return firstVar + " (" + firstVar.getClass() + ")" + "\n" +
                secondVar + " (" + secondVar.getClass() + ")" + "\n" +
                thirdVar + " (" + thirdVar.getClass() + ")";
    }
}
