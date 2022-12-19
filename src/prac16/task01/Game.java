package prac16.task01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;

public class Game extends JFrame {
    public Game() {
        super("Игра");
        setSize(500, 500);
        setLayout(new BorderLayout());

        JTextField input = new JTextField(10);
        this.add(input);
        input.setHorizontalAlignment(JTextField.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton userButton = new JButton("Проверка");
        add(userButton, BorderLayout.SOUTH);
        final int[] counter = {0};
        Integer value = ThreadLocalRandom.current().nextInt(0, 20 + 1);

        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (input.getText().toString() == "") return;
                if (input.getText().toString().equals(value.toString())) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Молодец.",
                            "Ты угадал!",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                } else if (counter[0] == 2) {
                    JOptionPane.showMessageDialog(getContentPane(),
                            "Попытки закончились(",
                            "Пока.",
                            JOptionPane.PLAIN_MESSAGE);
                    setVisible(false);
                    dispose();
                } else {
                    counter[0]++;
                    if (Integer.parseInt(input.getText().toString()) > value) {
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Загаданное число меньше",
                                "Хорошая попытка.",
                                JOptionPane.PLAIN_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(getContentPane(),
                                "Загаданное число больше",
                                "Хорошая попытка.",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Game();
    }
}

