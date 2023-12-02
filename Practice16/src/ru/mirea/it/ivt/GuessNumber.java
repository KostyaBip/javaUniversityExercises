package ru.mirea.it.ivt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessNumber extends JFrame {

    int numOfAttempts = 3;
    int numberGuessed;

    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Игра \"Угадай число!\"");
    JLabel label = new JLabel("Программа загадывает число от 0 до 20, а ваша задача отгадать его за 3 попытки");
    JLabel label2 = new JLabel("Попыток осталось : " + numOfAttempts);
    JTextField jta1 = new JTextField(10);
    JButton buttonGuess = new JButton(" Угадать! ");

    GuessNumber() {
        super("Угадай число");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(label1);
        panel.add(label);
        panel.add(label2);
        panel.add(jta1);
        panel.add(buttonGuess);
        getContentPane().add(panel, BorderLayout.CENTER);

        Random rand = new Random();
        numberGuessed = rand.nextInt(0, 21);
        //numberGuessed = 10;

        buttonGuess.addActionListener(new ActionListener() {
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(jta1.getText().trim());
                    if (num == numberGuessed) {
                        JOptionPane.showMessageDialog(null, "Вы угадали! Число = " + num,
                                "Win", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } else if (numOfAttempts > 1) {
                        JOptionPane.showMessageDialog(null, "Загаданное число " +
                                        (num < numberGuessed ? "больше" : "меньше") + " введённого (" + num + ")",
                                "Near...", JOptionPane.INFORMATION_MESSAGE);
                        numOfAttempts--;
                        label2.setText("Попыток осталось : " + numOfAttempts);
                    } else {
                        JOptionPane.showMessageDialog(null, "Вы проиграли, загаданное число - "
                                        + numberGuessed,
                                "Loose", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }

                } catch (Exception ex) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !",
                            "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pack();
        setVisible(true);
    }

}
