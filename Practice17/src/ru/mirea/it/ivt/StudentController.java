package ru.mirea.it.ivt;

public class StudentController {
    private Student student;
    private StudentView studentView;

    public StudentController(Student student, StudentView studentView){
        this.student = student;
        this.studentView = studentView;
    }

    public String getStudentRollNo() {
        return student.getRollNo();
    }

    public void setStudentRollNo(String rollNo) {
        student.setRollNo(rollNo);
    }

    public String getStudentName() {
        return student.getName();
    }

    public void setStudentName(String name) {
        student.setName(name);
    }

    public void updateView(){
        studentView.printStudentDetails(getStudentRollNo(),getStudentName());
    }
}
