package ru.mirea.it.ivt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <E> ArrayList<E> convertArrayToList(E[] array) { //extends Number | String
        return new ArrayList<>(Arrays.asList(array));
        /*ArrayList<E> list = new ArrayList<>();
        for(E elem : array){
            list.add(elem);
        }
        return list;*/
    }


    public static void main(String[] args) {
        //Exercise1
        String[] array = {"Hello", ",", "it's", "me"};
        ArrayList<String> list = convertArrayToList(array);
        for (String elem : list) {
            System.out.println(elem);
        }

        //Exercise2
        universalArray<String> arrayStr = new universalArray<>();
        arrayStr.setArray(array);
        for (String elem : arrayStr.getArray()) {
            System.out.println(elem);
        }

        universalArray<Number> arrayInt = new universalArray<>();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arrayInt.setArray(new Integer[]{1, 2, 3, 4, 5});
        for (Number elem : arrayInt.getArray()) {
            System.out.println(elem);
        }
    }
}