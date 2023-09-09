package Screens;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame {
    public Loading() {
        setTitle("결제 진행 중");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 1080);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel("결제 진행 중입니다...");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Dialog", Font.BOLD, 20));

        panel.add(label, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }
}

