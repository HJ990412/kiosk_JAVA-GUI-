package Screens;

import javax.swing.*;

import Device.Kiosk;
import Device.OrderDevice;
import Device.OrderNumber;
import Device.PaymentDevice;
import Device.PaymentReq;
import Device.PosDevice;
import Device.PurchaseOrder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardInput1 extends JFrame implements ActionListener{
    private JTextField cardNumberField;

    public CardInput1() {
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

        cardNumberField = new JTextField(16);
        
        JLabel cardNumberLabel = new JLabel("카드 번호:");
        cardNumberLabel.setFont(new Font("Dialog", Font.BOLD, 40)); 
        cardNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);

        fieldPanel.add(cardNumberLabel);
        fieldPanel.add(cardNumberField);

        
        for (int i = 0; i < 10; i++) {
            JButton numberButton = new JButton("" + i);
            numberButton.addActionListener(this);
            numPanel.add(numberButton);
        }

        JButton submitButton = new JButton("확인");
        numPanel.add(submitButton);

        submitButton.addActionListener(e -> {
            String cardNumber = cardNumberField.getText();
                     
            System.out.println("카드 번호: " + cardNumber);
            
            
            new CardInput2(cardNumber);
            setVisible(false);
        });
        
        JButton clearButton = new JButton("지우기");
        numPanel.add(clearButton);
        
        clearButton.addActionListener(e -> {
            cardNumberField.setText("");
        });
        
        

        panel.add(fieldPanel);
        panel.add(numPanel);

        add(panel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                String buttonText = e.getActionCommand();
                cardNumberField.setText(cardNumberField.getText() + buttonText);
                
    }


    
}