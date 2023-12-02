package ru.mirea.it.ivt;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Draw extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Random random = new Random();
        int color, positionX, positionY, type;

        for(int i = 0; i < 20; i++) {
            type = random.nextInt(1, 4);
            color = random.nextInt(1, 4);
            positionX = random.nextInt(50, 1150);
            positionY = random.nextInt(50, 750);

            switch (color) {
                case 1:
                    g.setColor(Color.RED);
                    break;
                case 2:
                    g.setColor(Color.GREEN);
                    break;
                case 3:
                    g.setColor(Color.BLUE);
                    break;
            }

            switch (type) {
                case 1:
                    Square rect = new Square(random.nextInt(20, 50), random.nextInt(20, 50),
                            positionX, positionY, color);
                    g.fillRect(rect.positionX, rect.positionY, rect.width, rect.height);
                    break;
                case 2:
                    Circle circle = new Circle(random.nextInt(20, 50), positionX, positionY, color);
                    g.fillOval(circle.positionX, circle.positionY, 2 * circle.radius, 2 * circle.radius);
                    break;
                case 3:
                    int side = random.nextInt(20, 50);
                    Triangle triangle = new Triangle(side, side, side, positionX, positionY, color);
                    int[] xPoints = {positionX - triangle.side1, positionX, positionX - triangle.side1 / 2};
                    int[] yPoints = {positionY, positionY, positionY - (int) (Math.sqrt(3) * triangle.side1 / 2)};
                    g.fillPolygon(xPoints, yPoints, 3);
            }
        }
    }
}
