package ru.mirea.it.ivt;

public class MinMax<E extends Comparable<E>>{
    private E[] array;
    //public E maxMin;

    public MinMax(E[] array) {
        this.array = array;
    }

    public E findMax(){
        E max = array[0];
        for (E elem : array){
            int comp = max.compareTo(elem);
            if(comp < 0)
                max = elem;
        }
        return max;
    }

    public E findMin(){
        E min = array[0];
        for (E elem : array){
            int comp = min.compareTo(elem);
            if(comp > 0)
                min = elem;
        }
        return min;
    }

    public E[] getArray() {
        return array;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

/*    @Override
    public int compareTo(MinMax<E> another) {
        return maxMin.compareTo(another.maxMin);
    }*/
}
