package prac22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorUI extends JFrame {
    JTextField text;
    ArrayList<JButton> btns = new ArrayList<>(0);

    CalculatorUI() {
        super("Калькулятор");
        text = new JTextField();
        JPanel textPanel = new JPanel();
        text.setPreferredSize(new Dimension(150, 20));
        textPanel.add(text);

        ButtonClick buttonClick = new ButtonClick();
        btns.add(new JButton("7"));
        btns.add(new JButton("8"));
        btns.add(new JButton("9"));
        btns.add(new JButton("/"));
        btns.add(new JButton("4"));
        btns.add(new JButton("5"));
        btns.add(new JButton("6"));
        btns.add(new JButton("*"));
        btns.add(new JButton("1"));
        btns.add(new JButton("2"));
        btns.add(new JButton("3"));
        btns.add(new JButton("-"));
        btns.add(new JButton("0"));
        btns.add(new JButton("."));
        btns.add(new JButton("="));
        btns.add(new JButton("+"));
        JPanel btnsPanel = new JPanel();
        btnsPanel.setLayout(new GridLayout(4,4));
        for(int i = 0; i < btns.size(); i++) {
            btns.get(i).addActionListener(buttonClick);
            btnsPanel.add(btns.get(i));
        }

        JButton space = new JButton("Space");
        JButton backspace = new JButton("Clear");
        space.addActionListener(buttonClick);
        backspace.addActionListener(buttonClick);
        JPanel downPanel = new JPanel();
        downPanel.setLayout(new GridLayout(1, 2));
        downPanel.add(space);
        downPanel.add(backspace);

        setLayout(new BorderLayout());
        add(textPanel, BorderLayout.NORTH);
        add(btnsPanel, BorderLayout.CENTER);
        add(downPanel, BorderLayout.SOUTH);
        setSize(250, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    class ButtonClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Space")) {
                text.setText(text.getText() + " ");
            } else if (e.getActionCommand().equals("Clear")) {
                try {
                    text.setText("");
                } catch (StringIndexOutOfBoundsException exception) {
                    text.setText("");
                }
            } else if (e.getActionCommand().equals("=")) {
                text.setText(CalculatorDriver.calculate(text.getText()));
            } else {
                text.setText(text.getText() + e.getActionCommand());
            }
        }
    }
}