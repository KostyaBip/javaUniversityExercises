package ru.mirea.it.ivt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionMenu extends JFrame {
    JComboBox<String> comboBox = new JComboBox<>();

    SelectionMenu(){
        super("Selection menu");
        setLayout(new FlowLayout());
        setSize(150,150);
        comboBox.addItem("Australia");
        comboBox.addItem("China");
        comboBox.addItem("Russia");
        comboBox.addItem("England");

        add(comboBox);
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedValue = (String) comboBox.getSelectedItem();
                switch (selectedValue){
                    case "Australia":
                        JOptionPane.showMessageDialog(null, "Австралия — огромная страна-остров, " +
                                        "известная своими уникальными экосистемами, разнообразной фауной, " +
                                        "включая кенгуру и коала, а также знаменитыми природными объектами, " +
                                        "вроде Великого Барьерного Рифа.",
                                "Alert",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "China":
                        JOptionPane.showMessageDialog(null, "Китай — крупнейшая страна в Азии," +
                                        " обладающая богатой историей и культурным наследием," +
                                        " современной индустрией и впечатляющими архитектурными достопримечательностями," +
                                        " такими как Великая Китайская стена.",
                                "Alert",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Russia":
                        JOptionPane.showMessageDialog(null, "Россия — самая обширная страна в мире," +
                                        " простирающаяся от Восточной Европы до Северной Азии," +
                                        " с удивительными природными богатствами, разнообразной культурой и историей," +
                                        " а также влиятельной ролью в мировых делах.",
                                "Alert",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "England":
                        JOptionPane.showMessageDialog(null, "Англия — часть Соединенного Королевства," +
                                        " известная своими историческими замками, культурными достижениями," +
                                        " такими как Шекспировский театр, и столицей Лондоном," +
                                        " являющимся финансовым и культурным центром.",
                                "Alert",JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        });

        setVisible(true);
    }

}
