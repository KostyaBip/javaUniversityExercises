package ru.mirea.it.ivt;

public class Main {

    private static Student retriveStudentFromDataBase(){
        Student student = new Student();
        student.setRollNo("12345");
        student.setName("Egor");
        return student;
    }
    public static void main(String[] args) {

        Student student = retriveStudentFromDataBase();

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(student,studentView);

        studentController.updateView();

        studentController.setStudentName("Maria");
        studentController.setStudentRollNo("659543");

        System.out.println("After updating, Course details are as follows");

        studentController.updateView();
    }
}