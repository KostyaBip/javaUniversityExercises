package ru.mirea.it.ivt;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static int getNum(){
        Scanner scan = new Scanner(System.in);
        int num;

        try {
            num = scan.nextInt();
            return num;
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Wrong input, entered line is not a number");
            scan.nextLine();
            return getNum();
        }
    }

    public static void Exercise1(){
        System.out.println(System.getProperty("user.name"));

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        Date now = new Date();
        System.out.println("Current time - " + dateFormatter.format(now));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,Calendar.DECEMBER);
        System.out.println("Work due date - " + dateFormatter.format(cal.getTime()));
    }

    public static void Exercise2(){
        Calendar cal = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter date in format YYYY MM DD HH MM SS. Example: 2023 12 31 12 31 09");

        boolean flag = true;
        while(flag) {
            flag = false;

            String date = scan.nextLine();
            String[] dateSeparated = date.split(" ");
            int[] dateSeparatedInt = new int[6];
            for (int i = 0; i < dateSeparated.length; i++)  {
                dateSeparatedInt[i] = Integer.parseInt(dateSeparated[i]);
            }

            if (dateSeparatedInt[0] < 1){
                System.out.println("Wrong year, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.YEAR, dateSeparatedInt[0]);

            if (dateSeparatedInt[1] < 1 || dateSeparatedInt[1] > 12){
                System.out.println("Wrong month, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.MONTH, dateSeparatedInt[1] - 1);

            if (dateSeparatedInt[2] < 1 || dateSeparatedInt[2] > 31){
                System.out.println("Wrong day, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.DAY_OF_MONTH, dateSeparatedInt[2] - 1);

            if (dateSeparatedInt[3] < 0 || dateSeparatedInt[3] > 23) {
                System.out.println("Wrong hour, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.HOUR, dateSeparatedInt[3]);

            if (dateSeparatedInt[4] < 0 || dateSeparatedInt[4] > 59){
                System.out.println("Wrong minute, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.MINUTE, dateSeparatedInt[4]);

            if (dateSeparatedInt[5] < 0 || dateSeparatedInt[5] > 59){
                System.out.println("Wrong seconds, enter again: ");
                flag = true;
                break;
            }
            else cal.set(Calendar.SECOND, dateSeparatedInt[5]);

        }

        SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        Date now = new Date();
        System.out.println("Current date - " + dateFormatter.format(now));

        System.out.println("Entered date - " + dateFormatter.format(cal.getTime()));

        System.out.println("Entered date is " + (now.after(cal.getTime())? "before " : "after ") + "current date");
    }

    public static void Exercise3(){
        Calendar dateOfBirthday1 = Calendar.getInstance();
        Calendar dateOfBirthday2 = Calendar.getInstance();
        dateOfBirthday1.set(2003,Calendar.JUNE,14,12,40,0);
        dateOfBirthday2.set(2004,Calendar.DECEMBER,16,17,23,11);

        Student student1 = new Student("Petya",19,4.2, dateOfBirthday1);
        Student student2 = new Student("Maria",18,4.85,dateOfBirthday2);

        System.out.println(student1 + "\n" + student2);
    }

    public static void Exercise4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год, месяц и дату в формате YYYY MM DD : ");
        String dateString = scanner.nextLine();

        String[] dateSeparated = dateString.split(" ");
        int[] dateSeparatedInt = new int[3];
        for(int i = 0; i < dateSeparated.length; i++)  dateSeparatedInt[i] = Integer.parseInt(dateSeparated[i]);


        System.out.print("Введите часы и минуты в формате mm ss : ");
        String timeString = scanner.nextLine();

        String[] timeSeparated = timeString.split(" ");
        int[] timeSeparatedInt = new int[2];
        for(int i = 0; i < timeSeparated.length; i++)  timeSeparatedInt[i] = Integer.parseInt(timeSeparated[i]);

        // Создание объекта Date
        Date date = new Date(dateSeparatedInt[0] - 1900, dateSeparatedInt[1] - 1,
                dateSeparatedInt[2], timeSeparatedInt[0], timeSeparatedInt[1]);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(dateSeparatedInt[0], dateSeparatedInt[1] - 1, dateSeparatedInt[2],
                timeSeparatedInt[0], timeSeparatedInt[1]);

        // Вывод информации
        System.out.println("Дата и время в виде объекта Date: " + date);
        System.out.println("Дата и время в виде объекта Calendar: " + calendar.getTime());
    }

    public static void Exercise5(){
        final int N = 1000;

        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println(startTime);
        long addTimeArrayList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        long deleteTimeArrayList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(arrayList.size(), i);
        }
        endTime = System.nanoTime();
        long insertTimeArrayList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.contains(i);
        }
        endTime = System.nanoTime();
        long searchTimeArrayList = endTime - startTime;

        LinkedList<Integer> linkedList = new LinkedList<>();

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long addTimeLinkedList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.removeLast();
        }
        endTime = System.nanoTime();
        long deleteTimeLinkedList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            int index = linkedList.size();
            linkedList.add(index, i);
        }
        endTime = System.nanoTime();
        long insertTimeLinkedList = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.contains(i);
        }
        endTime = System.nanoTime();
        long searchTimeLinkedList = endTime - startTime;

        System.out.println("ArrayList добавление: " + addTimeArrayList/(double)N + " наносекунд");
        System.out.println("ArrayList удаление: " + deleteTimeArrayList/(double)N + " наносекунд");
        System.out.println("ArrayList вставка: " + insertTimeArrayList/(double)N + " наносекунд");
        System.out.println("ArrayList поиск: " + searchTimeArrayList/(double)N + " наносекунд");

        System.out.println("LinkedList добавление: " + addTimeLinkedList/(double)N + " наносекунд");
        System.out.println("LinkedList удаление: " + deleteTimeLinkedList/(double)N + " наносекунд");
        System.out.println("LinkedList вставка: " + insertTimeLinkedList/(double)N + " наносекунд");
        System.out.println("LinkedList поиск: " + searchTimeLinkedList/(double)N + " наносекунд");
    }

    public static void main(String[] args) {

        int chooseExecise = 0;
        while(chooseExecise != -1) {
            System.out.println("Enter number of exercise from 1 to 5 or -1 to exit");

            chooseExecise = getNum();

            switch (chooseExecise) {
                case (1):
                    Exercise1();
                    break;
                case (2):
                    Exercise2();
                    break;
                case (3):
                    Exercise3();
                    break;
                case (4):
                    Exercise4();
                    break;
                case (5):
                    Exercise5();
                    break;
                case (-1):
                    System.out.println("Shutdown");
                    break;
                default:
                    System.out.println("Wrong input, entered number is not a command");
                    break;
            }
        }
    }
}