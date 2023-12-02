package ru.mirea.it.ivt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui5_1 extends JFrame{

    private int madrid = 0, melan = 0;
    private JButton madridButton = new JButton("Real Madrid");
    private JButton milanButton = new JButton("AC Milan");
    private JLabel resultLabel = new JLabel("Result:" + melan + "x" + madrid);
    private JLabel lastScorerLabel = new JLabel("Last scorer: N/A");
    private JLabel winnerLabel = new JLabel("Winner: DRAW");

    public Gui5_1(){
        super("Exercise 5.1");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));

        milanButton.addActionListener(new milanButtonEventListener());
        madridButton.addActionListener(new madridButtonEventListener());

        container.add(milanButton);
        container.add(madridButton);
        container.add(resultLabel);
        container.add(lastScorerLabel);
        container.add(winnerLabel);
    }

    class madridButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            madrid += 1;
            resultLabel.setText("Result:" + melan + "x" + madrid);
            lastScorerLabel.setText("Last scorer: Real Madrid");
            String res;
            if(madrid > melan){
                res = "Real Madrid";
            }
            else if(madrid < melan){
                res = "AC Milan";
            }
            else res = "DRAW";
            winnerLabel.setText("Last scorer: " + res);
        }
    }
    class milanButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            melan += 1;
            resultLabel.setText("Result:" + melan + "x" + madrid);
            lastScorerLabel.setText("Last scorer: AC Milan");
            String res;
            if(madrid > melan){
                res = "Real Madrid";
            }
            else if(madrid < melan){
                res = "AC Milan";
            }
            else res = "DRAW";
            winnerLabel.setText("Last scorer: " + res);
        }
    }
}
