package ru.mirea.it.ivt;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.averageMark, student1.averageMark);
        // -1 - stud2 < stud1, 1 - stud2 > stud1, 0 - stud2 = stud1
    }

    public void quickSort(Student[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(Student[] arr, int low, int high) {
        if (low < high) {
            // Разделение и получение индекса опорного элемента
            int pivotIndex = partition(arr, low, high);

            // Рекурсивно сортируем элементы перед опорным и после опорного
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(Student[] arr, int low, int high) {
        Student pivot = arr[high];
        int i = low - 1; // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) == -1) {
                i++;

                // Поменять элементы местами
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Поменять опорный элемент и элемент, находящийся после него
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
