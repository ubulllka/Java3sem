package prac05.task01;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGui extends JFrame implements ActionListener {

    JButton button1, button2;
    JLabel label1,label2,label3;
    int cntACMilan, cntRealMadrid;
    public FirstGui(){
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,750);
        frame.setPreferredSize(new Dimension(300,300));
        frame.setBackground(Color.gray);

        cntACMilan=0;
        cntRealMadrid=0;
        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,100,50);
        JPanel panel2 = new JPanel();
        panel2.setBounds(150,0,150,50);
        JPanel panel3 = new JPanel();
        panel3.setBounds(0,50,300,100);


        button1 = new JButton("AC Milan");
        button2 = new JButton("Real Madrid");
        button1.addActionListener(this);
        button2.addActionListener(this);
        label1 = new JLabel("Result: "+cntACMilan+" X "+cntRealMadrid, JLabel.CENTER);
        label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        label3 = new JLabel("Winner: DRAW",JLabel.CENTER);

        panel1.add(button1);
        panel2.add(button2);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.setBorder(new EmptyBorder(new Insets(0, 90, 40, 50)));
        panel3.add(label1);
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(label2);
        panel3.add(Box.createRigidArea(new Dimension(0, 5)));
        panel3.add(label3);

        frame.getContentPane().add(panel1);
        frame.getContentPane().add(panel2);

        frame.getContentPane().add(panel3);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        FirstGui firstGui = new FirstGui();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            cntACMilan+=1;
            label1.setText("Result: "+cntACMilan+" X "+cntRealMadrid);
            label2.setText("Last Scorer: AC Milan");
        }
        if (e.getSource() == button2){
            cntRealMadrid+=1;
            label1.setText("Result: "+cntACMilan+" X "+cntRealMadrid);
            label2.setText("Last Scorer: Real Madrid");
        }
        if ((e.getSource()==button1)||(e.getSource()==button2)){
            if(cntACMilan>cntRealMadrid){
                label3.setText("Winner: AC Milan");
            }
            else if (cntRealMadrid == cntACMilan) {
                label3.setText("Winner: DRAW");
            }
            else {
                label3.setText("Winner: Real Madrid");
            }
        }
    }
}

