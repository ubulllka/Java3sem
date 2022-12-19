package prac16.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Areas extends JFrame {
    public Areas() {
        super("TextAreas");
        setSize(500, 500);
        setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel center = new JPanel();
        center.setLayout(new GridBagLayout());
        add(center, BorderLayout.CENTER);
        center.add(new JLabel("C"));

        JPanel west = new JPanel();
        west.setLayout(new GridBagLayout());
        add(west, BorderLayout.WEST);
        west.add(new JLabel("W"));

        JPanel south = new JPanel();
        south.setLayout(new GridBagLayout());
        add(south, BorderLayout.SOUTH);
        south.add(new JLabel("S"));

        JPanel north = new JPanel();
        north.setLayout(new GridBagLayout());
        add(north, BorderLayout.NORTH);
        north.add(new JLabel("N"));

        JPanel east = new JPanel();
        east.setLayout(new GridBagLayout());
        add(east, BorderLayout.EAST);
        east.add(new JLabel("E"));

        final Integer[] mouse_prev_position = {0};

        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 1) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Welcome to the CAO",
                        "Areas",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 2) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Welcome to the ZAO",
                        "Areas",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 3) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Welcome to the UAO",
                        "Areas",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 4) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Welcome to the ZAO",
                        "Areas",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (mouse_prev_position[0] == 5) return;
                JOptionPane.showMessageDialog(getContentPane(),
                        "Good job.",
                        "Welcome to the VAO",
                        JOptionPane.PLAIN_MESSAGE);
                mouse_prev_position[0] = 1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Areas();
    }
}