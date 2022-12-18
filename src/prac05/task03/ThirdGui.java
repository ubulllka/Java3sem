package prac05.task03;


import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;

public class ThirdGui extends JFrame {

    public ThirdGui(String str) {
        JFrame frame = new JFrame("My third GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        ImageIcon image = new ImageIcon();
        JLabel imagelabel = new JLabel(image, JLabel.CENTER);
        frame.add(imagelabel);
        ImageIcon icon = new ImageIcon(str);
        JLabel label = new JLabel(icon, JLabel.CENTER);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        String adress = args[0];
        ThirdGui thirdGui = new ThirdGui(adress);
    }
}

