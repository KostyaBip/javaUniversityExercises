package ru.mirea.it.ivt;

import java.util.ArrayList;
public class testStudent {
    public ArrayList<Student> studentArrayList = new ArrayList<>();

    public testStudent(Student[] studentArrayList) {
        for(Student student : studentArrayList){
            this.studentArrayList.add(student);
        }
    }

    public void sortByMarks(){
        int n = this.studentArrayList.size();
        for (int i = 1; i < n; i++) {
            double key = this.studentArrayList.get(i).averageMark;
            Student studentKey = this.studentArrayList.get(i);
            int j = i - 1;

            while (j >= 0 && this.studentArrayList.get(j).averageMark > key) {
                this.studentArrayList.set(j+1, this.studentArrayList.get(j));
                j--;
            }

            this.studentArrayList.set(j+1, studentKey);
        }
    }

    public void printArray(){
        for (Student student : this.studentArrayList) {
            System.out.print(student + " ");
        }
        System.out.println("");
    }

}
