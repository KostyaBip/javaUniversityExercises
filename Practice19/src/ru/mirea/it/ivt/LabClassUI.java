package ru.mirea.it.ivt;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class LabClassUI extends JFrame {
    LabClass labClass;
    JButton searchButton;
    JButton sortButton;
    JTextField[] textField = new JTextField[6];
    public LabClassUI(Student[] students) {
        super("Students");
        labClass = new LabClass(students);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);

        searchButton = new JButton("Search student");
        sortButton = new JButton("Sort students");

        this.textField[0] = new JTextField("Name");

        searchButton.addActionListener(e -> {
            try {
                String name = textField[0].getText();

                if (Objects.equals(name, "") )
                    throw new EmptyStringException();
                else {
                    Student student = labClass.searchStudent(name);
                    JOptionPane.showMessageDialog(this, student);
                }
            } catch (StudentNotFoundException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            updateUI();
        });

        sortButton.addActionListener(e -> {
            SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
            sortingStudentsByGPA.quickSort(labClass.students);
            updateUI();
        });

        updateUI();
    }

    public void updateUI() {
        JPanel main_panel = new JPanel();
        GridLayout container_layout = new GridLayout(2, 1);
        main_panel.setLayout(container_layout);

        JPanel student_panel = new JPanel();
        GridLayout student_container = new GridLayout(labClass.students.length,1);
        student_panel.setLayout(student_container);

        JPanel UI_panel = new JPanel();
        GridLayout container_UI = new GridLayout(2, 1);
        UI_panel.setLayout(container_UI);

        for(int i = 0; i < labClass.students.length;i++){
            JTextField jTextField = new JTextField(String.valueOf(labClass.students[i]));
            student_panel.add(jTextField);
        }
        UI_panel.add(textField[0]);

        JPanel searchPanel = new JPanel(new GridLayout(2, 1));
        searchPanel.add(searchButton);
        searchPanel.add(sortButton);
        UI_panel.add(searchPanel);

        main_panel.add(UI_panel);
        main_panel.add(student_panel);
        this.getContentPane().removeAll();
        this.repaint();
        this.add(main_panel);
        this.setVisible(true);
    }
}