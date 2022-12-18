package prac05.task02;

import java.awt.*;

public class Rectangle extends Shape {

    @Override
    void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT, int i) {
        g.setColor(this.color);
        g.fillRect((i%5)*200, (int)((i/5)*200), (int) (Math.random() * WINDOW_WIDTH) / 2, (int) (Math.random() * WINDOW_HEIGHT) / 2);
    }
}