package chapter_14;

import javax.swing.*;
import java.awt.*;

public class JFrameWithComponents extends JFrame {
    JLabel label = new JLabel("Name?");
    JTextField field = new JTextField(12);
    JButton button = new JButton("OK");

    public JFrameWithComponents() {
        super("Frame with Components");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(label);
        add(field);
        add(button);

    }

    public static void main(String[] args) {
        JFrameWithComponents aFrame = new JFrameWithComponents();
        final int WIDTH = 350;
        final int HEIGHT = 100;
        aFrame.setSize(WIDTH, HEIGHT);
        aFrame.setVisible(true);


    }
}
