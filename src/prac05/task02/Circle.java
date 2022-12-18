package prac05.task02;

import java.awt.*;

public class Circle extends Shape {
    @Override
    void drawShape(Graphics2D g, int WINDOW_WIDTH, int WINDOW_HEIGHT, int i) {

        int diameter = (int) (Math.random() / 2 * Math.min(WINDOW_HEIGHT, WINDOW_WIDTH));

        g.setColor(this.color);
        g.fillOval((i%5)*200, (int)((i/5)*200), diameter, diameter);
    }
}
