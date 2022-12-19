package prac15.task02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Box extends JFrame {
    private int maxXBorder = 300, maxYBorder = 250;

    Font fontBox = new Font("Verdana", Font.PLAIN, 18);
    Font fontName = new Font("Verdana", Font.PLAIN, 24);
    Font fontText = new Font("Verdana", Font.PLAIN, 16);

    JPanel[] panel = new JPanel[4];
    final JLabel countryName = new JLabel(" ");
    final JLabel textPopulation = new JLabel("");
    final JLabel textSquare = new JLabel("");

    String[] countries = {
            "Australia",
            "China",
            "England",
            "Russia",
    };


    public Box(){
        super("Countries");
        setLayout(new GridLayout(4,1));
        for (int i = 0; i < 4; i++){
            panel[i] = new JPanel();
            add(panel[i]);
        }

        countryName.setFont(fontName); //текст
        panel[1].add(countryName);

        textPopulation.setFont(fontText);
        panel[2].add(textPopulation);

        textSquare.setFont(fontText);
        panel[3].add(textSquare);

        JComboBox comboBox = new JComboBox(countries);
        comboBox.setFont(fontBox);
        panel[0].add(comboBox);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                countryName.setText(item);

                switch (item){
                    case "Australia":
                        textPopulation.setText("Population: 27 970 622 people");
                        textSquare.setText("Square: 7 692 024 km");
                        break;
                    case "China":
                        textPopulation.setText("Population: 1 410 539 758 people");
                        textSquare.setText("Square: 9 596 961 km");
                        break;
                    case "England":
                        textPopulation.setText("Population: 56 286 961 people");
                        textSquare.setText("Square: 133 396 km");
                        break;
                    case "Russia":
                        textPopulation.setText("Population: 147 182 123 people");
                        textSquare.setText("Square: 17 098 246 km");
                        break;
                }
            }
        };

        comboBox.addActionListener(actionListener);


        setSize(maxXBorder,maxYBorder);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Box();
    }
}
