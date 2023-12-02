package ru.mirea.it.ivt;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class Gui5_2 extends JFrame{

    private String fileName = "Practice5/src/imageToShow.png";
    // ../../../../imageToShow.png
    // D:/Users/bykov/Documents/JavaUniversity/Exercises/Practice5/src/imageToShow.png

    public Gui5_2(){
        super("Exercise 5.2");
        //this.setBounds(100, 100, 250, 100);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageComponent component = new ImageComponent();
        add(component);
    }

    class ImageComponent extends JComponent {
        private Image imageToShow;
        public ImageComponent() {
            try {
                imageToShow = ImageIO.read(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void paintComponent(Graphics g) {
            if (imageToShow == null) return;
            // Отображение рисунка в левом верхнем углу.
            g.drawImage(imageToShow, 0, 0, null);
        }

    }
}
