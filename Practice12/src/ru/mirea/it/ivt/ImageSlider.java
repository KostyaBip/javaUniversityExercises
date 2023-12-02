package ru.mirea.it.ivt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class ImageSlider extends JPanel {
    private JLabel imageLabel;
    private BufferedImage[] images;
    private int currentImageIndex = 0;
    private Timer timer;

    public ImageSlider() {
        // Загрузка изображений
        try {
            images = new BufferedImage[] {
                    ImageIO.read(new File("Practice12/src/Animation/Слой 1.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 2.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 3.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 4.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 5.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 6.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 7.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 8.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 9.png")),
                    ImageIO.read(new File("Practice12/src/Animation/Слой 10.png")),
            };
        } catch (IOException e) {
            e.printStackTrace();
        }

        imageLabel = new JLabel(new ImageIcon(images[currentImageIndex]));
        add(imageLabel);

        timer = new Timer(70, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключение на следующее изображение
                currentImageIndex = (currentImageIndex + 1) % images.length;
                imageLabel.setIcon(new ImageIcon(images[currentImageIndex]));
            }
        });
        timer.start();
    }
}
