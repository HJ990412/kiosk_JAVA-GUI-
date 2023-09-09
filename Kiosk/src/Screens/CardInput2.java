package Screens;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardInput2 extends JFrame implements ActionListener{
    
	private JTextField expiryYearField;
    

    public CardInput2(String cardNumber) {
        setTitle("카드 정보 입력");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,1080);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(1, 2));

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(4, 4));

        expiryYearField = new JTextField(2);
        
        
        JLabel expiryYearLabel = new JLabel("만료 년도:");
        expiryYearLabel.setFont(new Font("Dialog", Font.BOLD, 40));
        expiryYearLabel.setHorizontalAlignment(SwingConstants.CENTER);

        fieldPanel.add(expiryYearLabel);
        fieldPanel.add(expiryYearField);

        
        for (int i = 0; i < 10; i++) {
            JButton numberButton = new JButton("" + i);
            numberButton.addActionListener(this);
            numPanel.add(numberButton);
            
        }

        JButton submitButton = new JButton("확인");
        

        submitButton.addActionListener(e -> {
            
            String expiryYear = expiryYearField.getText();
            
            System.out.println("만료 년도: " + expiryYear);
            
            new CardInput3(cardNumber, expiryYear);
            setVisible(false);
        });
        
        JButton clearButton = new JButton("지우기");
        numPanel.add(clearButton);
        
        clearButton.addActionListener(e -> {
            expiryYearField.setText("");
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
                expiryYearField.setText(expiryYearField.getText() + buttonText);
                
    }


    
}