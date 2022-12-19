package prac15.task01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calc extends JFrame{
    private int maxXBorder = 300, maxYBorder = 250;

    JPanel[] panel = new JPanel[8];

    JTextField textNumber1 = new JTextField(3);
    JTextField textNumber2 = new JTextField(3);
    Font fontTextField = new Font("Times new roman",Font.BOLD,40);

    JLabel number1 = new JLabel();
    JLabel number2 = new JLabel();
    Font fontLabel = new Font("Times new roman",Font.BOLD,20);

    JButton butPlus = new JButton("+");
    JButton butMinus = new JButton("-");
    JButton butDivision = new JButton("/");
    JButton butMultiplication = new JButton("*");


    public Calc(){
        super("Calc");
        getContentPane().setBackground(new Color(245,245,220));
        setSize(maxXBorder,maxYBorder); //цвет и лайоут
        setLayout(new GridLayout(4,2));
        for (int i = 0; i < 8; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }

        panel[1].add(textNumber1); //поля для текста
        textNumber1.setForeground(Color.black);
        textNumber1.setBackground(new Color(121, 115, 115));
        textNumber1.setFont(fontTextField);

        panel[3].add(textNumber2);
        textNumber2.setForeground(Color.black);
        textNumber2.setBackground(new Color(121, 115, 115));
        textNumber2.setFont(fontTextField);

        panel[0].add(number1); //текст
        number1.setFont(fontLabel);
        number1.setText("Первое число");

        panel[2].add(number2);
        number2.setFont(fontLabel);
        number2.setText("Второе число");


        panel[4].add(butPlus); //кнопочки
        butPlus.setBackground(new Color(243, 66, 204, 166));
        panel[5].add(butMinus);
        butMinus.setBackground(new Color(243, 66, 204, 166));
        panel[6].add(butDivision);
        butDivision.setBackground(new Color(243, 66, 204, 166));
        panel[7].add(butMultiplication);
        butMultiplication.setBackground(new Color(243, 66, 204, 166));

        butPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double firstNum = Double.parseDouble(textNumber1.getText().trim());
                    double secondNum = Double.parseDouble(textNumber2.getText().trim());

                    JOptionPane.showMessageDialog(null,
                            "Результат: " + Double.toString(firstNum + secondNum),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);

                    textNumber1.setText("");
                    textNumber2.setText("");
                }
                catch (Exception exp){
                    JOptionPane.showMessageDialog(null, "Не заполнено поле ввода",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        butMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double firstNum = Double.parseDouble(textNumber1.getText().trim());
                    double secondNum = Double.parseDouble(textNumber2.getText().trim());

                    JOptionPane.showMessageDialog(null,
                            "Результат: " + Double.toString(firstNum - secondNum),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);

                    textNumber1.setText("");
                    textNumber2.setText("");
                }
                catch (Exception exp){
                    JOptionPane.showMessageDialog(null, "Не заполнено поле ввода",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        butDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double firstNum = Double.parseDouble(textNumber1.getText().trim());
                    double secondNum = Double.parseDouble(textNumber2.getText().trim());

                    JOptionPane.showMessageDialog(null,
                            "Результат: " + Double.toString(firstNum / secondNum),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);

                    textNumber1.setText("");
                    textNumber2.setText("");
                }
                catch (Exception exp){
                    JOptionPane.showMessageDialog(null, "Не заполнено поле ввода",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        butMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double firstNum = Double.parseDouble(textNumber1.getText().trim());
                    double secondNum = Double.parseDouble(textNumber2.getText().trim());

                    JOptionPane.showMessageDialog(null,
                            "Результат: " + Double.toString(firstNum * secondNum),
                            "Результат", JOptionPane.INFORMATION_MESSAGE);

                    textNumber1.setText("");
                    textNumber2.setText("");
                }
                catch (Exception exp){
                    JOptionPane.showMessageDialog(null, "Не заполнено поле ввода",
                            "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Calc();
    }
}