package Screens;

import javax.swing.*;

import Device.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Device.Kiosk;

public class CardInput3 extends JFrame implements ActionListener {
    
    private JTextField expiryMonthField;

    public CardInput3(String cardNumber, String expiryYear) {
        setTitle("카드 정보 입력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 1000);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(1, 2));

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(4, 4));

        expiryMonthField = new JTextField(2);

        JLabel expiryMonthLabel = new JLabel("만료 월:");
        expiryMonthLabel.setFont(new Font("Dialog", Font.BOLD, 40));
        expiryMonthLabel.setHorizontalAlignment(SwingConstants.CENTER);

        fieldPanel.add(expiryMonthLabel);
        fieldPanel.add(expiryMonthField);

        for (int i = 0; i < 10; i++) {
            JButton numberButton = new JButton("" + i);
            numberButton.addActionListener(this);
            numPanel.add(numberButton);
        }

        JButton submitButton = new JButton("확인");
        

        submitButton.addActionListener(e -> {
            
            String expiryMonth = expiryMonthField.getText();

            OrderNumber orderNum = new OrderDevice();
            PaymentReq payReq = new PaymentDevice();
            PurchaseOrder posDev = new PosDevice();

            System.out.println("카드 번호: " + cardNumber);
            System.out.println("만료 년도: " + expiryYear);
            System.out.println("만료 월: " + expiryMonth);

            new Kiosk(orderNum, payReq, posDev, cardNumber, expiryYear, expiryMonth);
            setVisible(false);
        });
        
        JButton clearButton = new JButton("지우기");
        numPanel.add(clearButton);
        
        clearButton.addActionListener(e -> {
           expiryMonthField.setText("");
        });
        numPanel.add(submitButton);

        panel.add(fieldPanel);
        panel.add(numPanel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        expiryMonthField.setText(expiryMonthField.getText() + buttonText);
        
    }
}

