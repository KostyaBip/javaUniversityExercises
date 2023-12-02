package ru.mirea.it.ivt;

import java.util.Comparator;
public class SortingStudentsByAge implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.age, student1.age);
        // -1 - stud2 < stud1, 1 - stud2 > stud1, 0 - stud2 = stud1
    }

    public Student[] mergeSort(Student[] arr1, Student[] arr2){
        Student[] arr = new Student[arr1.length+arr2.length];
        for(int i = 0; i < arr.length; i++){
            if(i< arr1.length){
                arr[i] = arr1[i];
            }
            else arr[i] = arr2[i- arr1.length];
        }

        mergeSort(arr);
        return arr;
    }

    public void mergeSort(Student[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Уже отсортировано
        }

        int mid = arr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[arr.length - mid];

        // Заполняем левый и правый подмассивы
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Рекурсивно сортируем левый и правый подмассивы
        mergeSort(left);
        mergeSort(right);

        // Объединяем отсортированные подмассивы
        merge(arr, left, right);
    }

    private void merge(Student[] arr, Student[] left, Student[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (compare(left[i],right[j]) == -1 || compare(left[i],right[j]) == 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
