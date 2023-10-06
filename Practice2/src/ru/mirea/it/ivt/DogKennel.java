package ru.mirea.it.ivt;

import java.util.ArrayList;

public class DogKennel {
    static ArrayList<Dog> arrayOfDogs = new ArrayList<>();

    public static void addDogToArray(Dog dog){
        arrayOfDogs.add(dog);
    }

    public static void printArrayOfDogs(){
        for(int i = 0; i < arrayOfDogs.size(); i++){
            System.out.println(arrayOfDogs.get(i).toString());
        }
        /*for(Dog i : arrayOfDogs){
            System.out.println(i.toString());
        }*/
    }
}
