package prac05.task04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

class ForthGui extends JFrame {

    String background_image_path;
    String animation_images_path = "C:\\Users\\Lenovo\\IdeaProjects\\java3sem\\src\\prac05\\task04\\ааа";
    int method;

    ForthGui() {
        super("My forth GUI");
        setSize(600, 600);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;

        Button btn = new Button("Start animation");
        btn.setSize(100, 50);
        btn.setLocation(0, 0);
        btn.addActionListener(
                new ActionListener () {
                    public void actionPerformed(ActionEvent event) {
                        method = 1;
                        setTitle("My forth GUI");
                        setSize(600 + 1, 600);
                        setSize(600 - 1, 600);
                    }
                }
        );
        add(btn);
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path;
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, 600, 600, this);
        animate(this.animation_images_path, g);
    }

    void animate(String frames_path, Graphics2D g) {
        File dir = new File(frames_path);
        for (File file : dir.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0, 0, 600,600, this);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        ForthGui app = new ForthGui();
    }
}
