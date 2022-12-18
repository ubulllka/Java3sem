package prac05.task02;

import java.awt.*;
import javax.swing.*;

class SecondGui extends JFrame {
    int WINDOW_WIDTH = 200;
    int WINDOW_HEIGHT = 200;

    public SecondGui() {
        super("My second GUI");
        setSize(1000, 800);
        setBackground(Color.WHITE);
        setLocation(30, 30);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        random_shapes_paint((Graphics2D) g);
    }

    void random_shapes_paint(Graphics2D g) {
        for (int i = 0; i < 20; i++) {
            int choice = (int) (Math.random() * 2);

            switch (choice) {

                case 0:
                    Rectangle rectangle = new Rectangle();
                    rectangle.drawShape((Graphics2D) this.getGraphics(), WINDOW_WIDTH, WINDOW_HEIGHT, i);
                    break;

                case 1:
                    Circle circle = new Circle();
                    circle.drawShape((Graphics2D) this.getGraphics(), WINDOW_WIDTH, WINDOW_HEIGHT, i);
                    break;

                default:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SecondGui app = new SecondGui();
    }
}

