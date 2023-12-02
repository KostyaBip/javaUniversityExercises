package ru.mirea.it.ivt;

import java.util.Objects;

public class LabClass {
    public Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public Student searchStudent(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (Objects.equals(name, student.getName()) )
                return student;
        }
        throw new StudentNotFoundException(name);
    }
}
