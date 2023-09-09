package Screens;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main7 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	public Main7() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창2");
		
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
        
        JButton icedTea_btn = new JButton();
        icedTea_btn.setLayout(new BorderLayout());
        JLabel imgIcedTea = new JLabel(functions2.resize2("./images/아이스티.png"));
        JLabel icedteaLabel = new JLabel("<html> iced tea <br> 2300원 </html>");
        imgIcedTea.setHorizontalAlignment(JLabel.CENTER);
        icedteaLabel.setHorizontalAlignment(JLabel.CENTER);
        icedTea_btn.add(imgIcedTea, BorderLayout.NORTH);
        icedTea_btn.add(icedteaLabel,BorderLayout.SOUTH);
        
        JButton greenTea = new JButton();
        greenTea.setLayout(new BorderLayout());
        JLabel imgGreentea = new JLabel(functions2.resize2("./images/녹차.png"));
        JLabel greenTeaLabel = new JLabel("<html> green tea <br> 2700원 </html>");
        imgGreentea.setHorizontalAlignment(JLabel.CENTER);
        greenTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        greenTea.add(imgGreentea, BorderLayout.NORTH);
        greenTea.add(greenTeaLabel, BorderLayout.SOUTH);

        JButton chamomileTea = new JButton();
        chamomileTea.setLayout(new BorderLayout());
        JLabel imgChamomileTea = new JLabel(functions2.resize2("./images/캐모마일.png"));
        JLabel chamomileTeaLabel = new JLabel("<html> chamomile tea <br> 2700원 </html>");
        imgChamomileTea.setHorizontalAlignment(JLabel.CENTER);
        chamomileTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        chamomileTea.add(imgChamomileTea, BorderLayout.NORTH);
        chamomileTea.add(chamomileTeaLabel, BorderLayout.SOUTH);
        
        JButton jasmineTea = new JButton();
        jasmineTea.setLayout(new BorderLayout());
        JLabel imgJasmineTea = new JLabel(functions2.resize2("./images/자스민.png"));
        JLabel jasmineTeaLabel = new JLabel("<html> jasmine tea <br> 2700원 </html>");
        imgJasmineTea.setHorizontalAlignment(JLabel.CENTER);
        jasmineTeaLabel.setHorizontalAlignment(JLabel.CENTER);
        jasmineTea.add(imgJasmineTea, BorderLayout.NORTH);
        jasmineTea.add(jasmineTeaLabel, BorderLayout.SOUTH);
        
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
        
        
        icedTea_btn.setBackground(Color.WHITE);
        icedTea_btn.setPreferredSize(new Dimension(150,300));
        greenTea.setBackground(Color.WHITE);
        chamomileTea.setBackground(Color.WHITE);
        jasmineTea.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(icedTea_btn);
        menu.add(greenTea);
        menu.add(chamomileTea);
        menu.add(jasmineTea);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(600,1080);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        icedTea_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "아이스티";
                Main.beverageNum = 1;
                Main.price = 2300;
                Main.bevPrice = 2300;
                new Options7();
                setVisible(false);
            }
        });
        greenTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "녹차";
            	Main.beverageNum = 1;
            	Main.price = 2700;
            	Main.bevPrice = 2700;
                new Options7();
                setVisible(false);
            }
        });
        chamomileTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "캐모마일";
            	Main.beverageNum = 1;
            	Main.price = 2700;
            	Main.bevPrice = 2700;
                new Options7();
                setVisible(false);
            }
        });
        
        jasmineTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "자스민";
            	Main.beverageNum = 1;
            	Main.price = 2700;
            	Main.bevPrice = 2700;
                new Options7();
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
