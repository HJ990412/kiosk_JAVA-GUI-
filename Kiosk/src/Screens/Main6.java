package Screens;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main6 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	public Main6() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창1");
		
		Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(238,238,238));
        
        JPanel category = new JPanel(new GridLayout(1,5));
        
        JButton coffeeTab = new JButton("COFFEE");
        JButton teaTab = new JButton("TEA");
        JButton adeTab = new JButton("ADE");
        JButton waffleTab = new JButton("WAFFLE");
        JButton smoothieTab = new JButton("SMOOTHIE");
        
        
        coffeeTab.setBackground(Color.WHITE);
        teaTab.setBackground(Color.WHITE);
        adeTab.setBackground(Color.WHITE);
        waffleTab.setBackground(Color.WHITE);
        smoothieTab.setBackground(Color.WHITE);
        
        coffeeTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.BLUE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.WHITE);
                new Main6();
                setVisible(false);
            }
        });

        teaTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.BLUE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.WHITE);
                new Main7();
                setVisible(false);
            }
        });

        adeTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.BLUE);
                waffleTab.setBackground(Color.WHITE);
                new Main8();
                setVisible(false);
            }
        });

        waffleTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.BLUE);
                new Main9();
                setVisible(false);
            }
        });
        
        smoothieTab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coffeeTab.setBackground(Color.WHITE);
                teaTab.setBackground(Color.WHITE);
                adeTab.setBackground(Color.WHITE);
                waffleTab.setBackground(Color.BLUE);
                new Main10();
                setVisible(false);
            }
        });
       
        
        category.add(coffeeTab);
        category.add(teaTab);
        category.add(adeTab);
        category.add(waffleTab);
        category.add(smoothieTab);
        
        JPanel menu = new JPanel(new GridLayout(2, 2));
        
        JButton americano_btn = new JButton();
        americano_btn.setLayout(new BorderLayout());
        JLabel imgAmericano = new JLabel(functions2.resize2("./images/아메리카노.png"));
        JLabel americanoLabel = new JLabel("<html> americano <br> 2000원 </html>");
        imgAmericano.setHorizontalAlignment(JLabel.CENTER);
        americanoLabel.setHorizontalAlignment(JLabel.CENTER);
        americano_btn.add(imgAmericano, BorderLayout.NORTH);
        americano_btn.add(americanoLabel,BorderLayout.SOUTH);
        
        JButton cafelatte = new JButton();
        cafelatte.setLayout(new BorderLayout());
        JLabel imgCafelatte = new JLabel(functions2.resize2("./images/카페라떼.png"));
        JLabel cafelatteLabel = new JLabel("<html> caffelatte <br> 2900원 </html>");
        imgCafelatte.setHorizontalAlignment(JLabel.CENTER);
        cafelatteLabel.setHorizontalAlignment(JLabel.CENTER);
        cafelatte.add(imgCafelatte, BorderLayout.NORTH);
        cafelatte.add(cafelatteLabel, BorderLayout.SOUTH);

        JButton cappucino = new JButton();
        cappucino.setLayout(new BorderLayout());
        JLabel imgCappucino = new JLabel(functions2.resize2("./images/카푸치노.png"));
        JLabel cappucinoLabel = new JLabel("<html> cappucino <br> 2900원 </html>");
        imgCappucino.setHorizontalAlignment(JLabel.CENTER);
        cappucinoLabel.setHorizontalAlignment(JLabel.CENTER);
        cappucino.add(imgCappucino, BorderLayout.NORTH);
        cappucino.add(cappucinoLabel, BorderLayout.SOUTH);
        
        JButton coldbrew = new JButton();
        coldbrew.setLayout(new BorderLayout());
        JLabel imgColdbrew = new JLabel(functions2.resize2("./images/콜드브루.png"));
        JLabel coldbrewLabel = new JLabel("<html> coldbrew <br> 2000원 </html>");
        imgColdbrew.setHorizontalAlignment(JLabel.CENTER);
        coldbrewLabel.setHorizontalAlignment(JLabel.CENTER);
        coldbrew.add(imgColdbrew, BorderLayout.NORTH);
        coldbrew.add(coldbrewLabel, BorderLayout.SOUTH);
        
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
        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("Order List");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        basket.add(getlargeBtn);
        basket.add(basket_btn);
        basket.add(getSmallBtn);
        
        
        menu.add(americano_btn);
        menu.add(cafelatte);
        menu.add(cappucino);
        menu.add(coldbrew);
        
        americano_btn.setBackground(Color.WHITE);
        americano_btn.setPreferredSize(new Dimension(150,300));
        cafelatte.setBackground(Color.WHITE);
        cappucino.setBackground(Color.WHITE);
        coldbrew.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(600, 1000);
        setLocationRelativeTo(null); 

        setVisible(true);
        
        americano_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.name = "아메리카노";
                Main.beverageNum = 1;
                Main.price = 2000;
                Main.bevPrice = 2000;
                new Options6();
                setVisible(false);
            }
        });
        cafelatte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "카페라떼";
            	Main.beverageNum = 1;
            	Main.price = 2900;
            	Main.bevPrice = 2900;
                new Options6();
                setVisible(false);
            }
        });
        cappucino.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "카푸치노";
            	Main.beverageNum = 1;
            	Main.price = 2900;
            	Main.bevPrice = 2900;
                new Options6();
                setVisible(false);
            }
        });
        
        coldbrew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "콜드브루";
            	Main.beverageNum = 1;
            	Main.price = 3500;
            	Main.bevPrice = 3500;
                new Options6();
                setVisible(false);
            }
        });
        
        basket_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Basket2();
                setVisible(false);
            }
        });
        
        basket_btn.setBackground(Color.WHITE);
        basket_btn.setForeground(Color.BLACK);
        
        
        
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
