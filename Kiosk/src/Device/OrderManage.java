package Device;

import javax.swing.*;

import Screens.Basket;
import Screens.Init_screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderManage extends JFrame {
    private JLabel orderCompleteLabel;
    private JLabel orderNumberLabel;
    private JLabel autoCloseLabel;
    private Timer autoCloseTimer;
    private int secondsLeft = 10;

    public OrderManage(String orderNumber) {
        setTitle("주문 완료");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 1080);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        orderCompleteLabel = new JLabel("주문을 완료하였습니다");
        orderCompleteLabel.setHorizontalAlignment(SwingConstants.CENTER);
        orderCompleteLabel.setFont(new Font("Dialog", Font.BOLD, 20));

        orderNumberLabel = new JLabel("주문번호: " + orderNumber);
        orderNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        orderNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 16));

        autoCloseLabel = new JLabel("10 초 후 자동 종료");
        autoCloseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        autoCloseLabel.setFont(new Font("Dialog", Font.PLAIN, 14));

        panel.add(orderCompleteLabel);
        panel.add(orderNumberLabel);
        panel.add(autoCloseLabel);

        add(panel);
        setVisible(true);

        startAutoCloseTimer();
    }

    private void startAutoCloseTimer() {
        autoCloseTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondsLeft--;
                autoCloseLabel.setText(secondsLeft + "초 후 자동 종료");

                if (secondsLeft <= 0) {
                    autoCloseTimer.stop();
                    new Init_screen().orderList.clear();
                   Basket.sumPrice = 0;
                }
            }
        });
        autoCloseTimer.start();
    }
}

