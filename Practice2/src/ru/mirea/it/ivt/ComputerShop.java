package ru.mirea.it.ivt;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerShop implements Shop{
    public String Name;
    public int numOfCpuCores, numOfGpuCores, numGbOfRam;
    static ArrayList<ComputerShop> arrayOfComputers = new ArrayList<>();
    public ComputerShop(String name, int numOfCpuCores, int numOfGpuCores, int numGbOfRam){
        this.Name = name;
        this.numOfCpuCores = numOfCpuCores;
        this.numOfGpuCores = numOfGpuCores;
        this.numGbOfRam = numGbOfRam;
    }

    public static void addItem(){
        System.out.println("At first create computer. " +
                "Enter name, number of CPU cores, number of GPU cores and number of RAM separated with space");
        Scanner scan = new Scanner(System.in);
        String name =scan.next();
        if(findIndex(name) == -1){
            ComputerShop computer = new ComputerShop(name, scan.nextInt(),scan.nextInt(),scan.nextInt());
            arrayOfComputers.add(computer);
            System.out.println("New computer was successfully added");
        }else System.out.println("Error. Computer named " + name + " is already exist");
    }

    public static void addItem(ComputerShop computer){
        if(findIndex(computer.Name) == -1){
            arrayOfComputers.add(computer);
            System.out.println("New computer was successfully added");
        }else System.out.println("Error. Computer named " + computer.Name + " is already in shop");
    }

    public static void deleteItem(){
        System.out.println("Enter the name of the computer you want to delete");
        Scanner scan = new Scanner(System.in);
        String nameToDel = scan.next();
        int index = findIndex(nameToDel);
        if(index != -1){
            arrayOfComputers.remove(index);
            System.out.println("Computer named " + nameToDel + " was successfully deleted");
        }else System.out.println("There's no computer named " + nameToDel);
    }

    public static void findItem(){
        System.out.println("Enter the name of the computer you want to find");
        Scanner scan = new Scanner(System.in);
        String nameToFind = scan.next();
        int index = findIndex(nameToFind);
        if(index != -1){
            ComputerShop tmpComp = arrayOfComputers.get(index);
            System.out.println("Computer named " + nameToFind + " was successfully found." +
                    "\nSpecifications of computer is: CPU cores - " + tmpComp.numOfCpuCores + "; GPU cores - " +
                    tmpComp.numOfGpuCores + "; amount of RAM - " + tmpComp.numGbOfRam + " GB");
        }
        else{
            System.out.println("There's no computer named " + nameToFind);
        }
    }

    private static int findIndex(String name){
        for(int i = 0; i < arrayOfComputers.size(); i++){
            if(name.equalsIgnoreCase(arrayOfComputers.get(i).Name)){
                return i;
            }
        }
        return -1;
    }
}
