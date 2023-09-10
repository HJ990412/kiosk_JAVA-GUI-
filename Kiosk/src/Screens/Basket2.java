package Screens;

import javax.swing.*;

import Info.Coffee;
import func.functions;

import java.awt.*;
import java.awt.event.*;

public class Basket2 extends JFrame{
	
	public static int sumPrice = 0;
	private JLabel priceLabel;
	
	public Basket2() {
		
		setTitle("장바구니");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(0, 10));
		
		JPanel basketPanel = new JPanel();
        basketPanel.setLayout(new BoxLayout(basketPanel, BoxLayout.Y_AXIS));
        
        JPanel basketListLabel = new JPanel();
        
        basketListLabel.setLayout(new GridLayout(1,3));
        
        basketListLabel.add(new JLabel(" "));
        JLabel basketListLabel_1 = new JLabel("orderList");
        JLabel basketListLabel_2 = new JLabel("price");
        
        basketListLabel_1.setFont(new Font("Dialog", Font.BOLD, 30));
        basketListLabel_2.setFont(new Font("Dialog", Font.BOLD, 30));
        basketListLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        basketListLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        
        basketListLabel.add(basketListLabel_1);
        basketListLabel.add(basketListLabel_2);
        
        basketPanel.add(basketListLabel);
        
        for(int i=0; i<Init_screen.orderList.size(); i++) {
        	JPanel basketList = new JPanel();
            basketList.setLayout(new GridLayout(1,3));
        	Coffee basket_list = Init_screen.orderList.get(i);
            
        	JPanel basketList1 = new JPanel();
            String imagePath = String.format("./images/%s.png", basket_list.getName());
            JLabel image = new JLabel(functions.resize(imagePath));
            basketList1.add(image);
            
            basketList.add(basketList1);
            
            JPanel basketList2 = new JPanel();
            basketList2.setLayout(new GridLayout(5,1));
            basketList2.add(new JLabel("<html><br>" + basket_list.getName()+ " " + basket_list.getBeverageNum() + "drink<br></html>"));
            if (basket_list.getShot() > 0) {
                basketList2.add(new JLabel("<html><br> plus shot " + basket_list.getShot() + "time(s)<br></html>"));
            }
            if (basket_list.getSyrup() > 0) {
                basketList2.add(new JLabel("<html><br> plus vanilla syrup " + basket_list.getSyrup() + "time(s)<br></html>"));
            }
            if (basket_list.getWhipping() > 0) {
                basketList2.add(new JLabel("<html><br> plus whipping " + basket_list.getWhipping() + "time(s)<br></html>"));
            }
            if (basket_list.getDecaf() != false) {
                basketList2.add(new JLabel("<html><br> change to decaffeine " + basket_list.getDecaf() + "<br><br></html>"));
            }

            
            basketList.add(basketList2);
            
            JPanel basketList3 = new JPanel();
            basketList3.add(new JLabel("<html><br>" + basket_list.getPrice()+"<br></html>"));
            
            basketList.add(basketList3);
            
            basketPanel.add(basketList);
            
            sumPrice += basket_list.getPrice();
            
            if (i < Init_screen.orderList.size() - 1) {
                JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
                separator.setPreferredSize(new Dimension(600, 1));
                basketPanel.add(separator);
            }
           
        }
        
        c.add(basketPanel, BorderLayout.NORTH);
        
        JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
        separator.setPreferredSize(new Dimension(600, 1));
        
        JPanel payInfo_BtnPanel = new JPanel(new GridLayout(3,1));
        
        JPanel payInfoPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("total price");
        priceLabel = new JLabel(String.valueOf(sumPrice));

        payInfoPanel.add(label);
        payInfoPanel.add(Box.createHorizontalStrut(200));
        payInfoPanel.add(priceLabel);

        FlowLayout layout = (FlowLayout) payInfoPanel.getLayout();
        layout.setVgap(5);


        
        JPanel payPanel = new JPanel(new GridLayout(1,4));
        
        
        c.add(payInfo_BtnPanel, BorderLayout.SOUTH);
        
        JButton getlargeBtn = new JButton("bigger letters");
        getlargeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFontSize(c); 
            }
        });
        
        JButton getSmallBtn = new JButton("smaller letters");
        getSmallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseFontSize(c);
            }
        });
        
        JButton goPay = new JButton("Pay");
        goPay.setBackground(new Color(0, 85, 67));
        goPay.setForeground(Color.WHITE);
        goPay.setPreferredSize(new Dimension(200, 50));
        
        JButton tmp = new JButton("back");
        tmp.setBackground(new Color(0, 85, 67));
        tmp.setForeground(Color.WHITE);
        tmp.setPreferredSize(new Dimension(200, 50));
        
        
        goPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new CardInput1();
                setVisible(false);
            }
        });

        tmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new Main6();
                setVisible(false);
            }
        });
        
        payPanel.add(getlargeBtn);
        payPanel.add(tmp);
        payPanel.add(goPay);
        payPanel.add(getSmallBtn);

        payInfo_BtnPanel.add(separator);
        payInfo_BtnPanel.add(payInfoPanel);
        payInfo_BtnPanel.add(payPanel);
        
        goPay.setBackground(Color.WHITE);
        goPay.setForeground(Color.BLACK);
        
        tmp.setBackground(Color.WHITE);
        tmp.setForeground(Color.BLACK);
        
        getSmallBtn.setBackground(Color.WHITE);
        getSmallBtn.setForeground(Color.BLACK);
        
        getlargeBtn.setBackground(Color.WHITE);
        getlargeBtn.setForeground(Color.BLACK);
        
        setSize(600, 1000);
        setLocationRelativeTo(null);    
        setVisible(true);
		
	}
	
	private void increaseFontSize(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JComponent) {
                JComponent jComponent = (JComponent) component;
                Font currentFont = jComponent.getFont();
                Font newFont = currentFont.deriveFont(currentFont.getSize() + 2f);
                jComponent.setFont(newFont);
            }
            if (component instanceof Container) {
                increaseFontSize((Container) component);
            }
        }
    }

	private void decreaseFontSize(Container container) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JComponent) {
                JComponent jComponent = (JComponent) component;
                Font currentFont = jComponent.getFont();
                Font newFont = currentFont.deriveFont(currentFont.getSize() - 2f);
                jComponent.setFont(newFont);
            }
            if (component instanceof Container) {
                decreaseFontSize((Container) component);
            }
        }
    }

}
