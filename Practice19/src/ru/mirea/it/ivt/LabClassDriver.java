package ru.mirea.it.ivt;

public class LabClassDriver {
    public void testStudents(){
        Student student1 = new Student("Mark",20,3.9);
        Student student2 = new Student("Petya",19,4.2);
        Student student3 = new Student("Maria",18,4.85);
        Student student4 = new Student("Elizaveta",21,3.4);
        Student[] students = new Student[]{student1, student2, student3, student4};

        new LabClassUI(students);
    }
}
