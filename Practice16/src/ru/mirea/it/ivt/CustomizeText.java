package ru.mirea.it.ivt;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class CustomizeText extends JFrame {
    JComboBox<String> comboBoxColor = new JComboBox<>();
    JComboBox<String> comboBoxFont = new JComboBox<>();
    JTextPane textPane = new JTextPane();
    JPanel panel = new JPanel(new BorderLayout());

    CustomizeText(){
        super("Customize text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout());
        setSize(400,300);

        StyledDocument doc = textPane.getStyledDocument();

        SimpleAttributeSet redStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(redStyle, Color.RED);

        SimpleAttributeSet blueStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(blueStyle, Color.BLUE);

        SimpleAttributeSet greenStyle = new SimpleAttributeSet();
        StyleConstants.setForeground(greenStyle, Color.GREEN);

        SimpleAttributeSet TimesNewRomanStyle = new SimpleAttributeSet();
        StyleConstants.setFontFamily(TimesNewRomanStyle, "Times New Roman");

        SimpleAttributeSet SansStyle = new SimpleAttributeSet();
        StyleConstants.setFontFamily(SansStyle, "MS Sans Serif");

        SimpleAttributeSet CourNewStyle = new SimpleAttributeSet();
        StyleConstants.setFontFamily(CourNewStyle, "Courier New");

        comboBoxColor.addItem("Red");
        comboBoxColor.addItem("Green");
        comboBoxColor.addItem("Blue");

        panel.add(comboBoxColor, BorderLayout.NORTH);

        comboBoxFont.addItem("Times New Roman");
        comboBoxFont.addItem("MS Sans Serif");
        comboBoxFont.addItem("Courier New");

        panel.add(comboBoxFont, BorderLayout.SOUTH);

        try {
            doc.insertString(doc.getLength(), "Красный текст.\n", redStyle);
            doc.insertString(doc.getLength(), "Синий текст.\n", blueStyle);
            doc.insertString(doc.getLength(), "Обычный текст.", null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
        panel.add(new JScrollPane(textPane), BorderLayout.CENTER);

        add(panel);

        comboBoxColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = (String) comboBoxColor.getSelectedItem();
                switch (selectedValue){
                    case "Red":
                        doc.setCharacterAttributes(0, doc.getLength(), redStyle, false);
                        break;
                    case "Green":
                        doc.setCharacterAttributes(0, doc.getLength(), greenStyle, false);
                        break;
                    case "Blue":
                        doc.setCharacterAttributes(0, doc.getLength(), blueStyle, false);
                        break;
                }
            }
        });

        comboBoxFont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = (String) comboBoxFont.getSelectedItem();
                switch (selectedValue){
                    case "Times New Roman":
                        doc.setCharacterAttributes(0, doc.getLength(), TimesNewRomanStyle, false);
                        break;
                    case "MS Sans Serif":
                        doc.setCharacterAttributes(0, doc.getLength(), SansStyle, false);
                        break;
                    case "Courier New":
                        doc.setCharacterAttributes(0, doc.getLength(), CourNewStyle, false);
                        break;
                }
            }
        });

        //pack();
        setVisible(true);
    }

}
