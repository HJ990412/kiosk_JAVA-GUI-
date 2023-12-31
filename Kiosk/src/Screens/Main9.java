package Screens;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main9 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	
	public Main9() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창4");
		
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
        
        JButton nutellaWaffle = new JButton();
        nutellaWaffle.setLayout(new BorderLayout());
        JLabel imgNutellaWaffle = new JLabel(functions2.resize2("./images/크런치누텔라와플.png"));
        JLabel nutellaWaffleLabel = new JLabel("<html> crunky nutella waffle <br> 3500원 </html>");
        imgNutellaWaffle.setHorizontalAlignment(JLabel.CENTER);
        nutellaWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        nutellaWaffle.add(imgNutellaWaffle, BorderLayout.NORTH);
        nutellaWaffle.add(nutellaWaffleLabel, BorderLayout.SOUTH);

        JButton pigWaffle = new JButton();
        pigWaffle.setLayout(new BorderLayout());
        JLabel imgPigWaffle = new JLabel(functions2.resize2("./images/크런치피그와플.png"));
        JLabel pigWaffleLabel = new JLabel("<html> crunky pig waffle <br> 3800원 </html>");
        imgPigWaffle.setHorizontalAlignment(JLabel.CENTER);
        pigWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        pigWaffle.add(imgPigWaffle, BorderLayout.NORTH);
        pigWaffle.add(pigWaffleLabel, BorderLayout.SOUTH);

        JButton strawberryWaffle = new JButton();
        strawberryWaffle.setLayout(new BorderLayout());
        JLabel imgStrawberryWaffle = new JLabel(functions2.resize2("./images/딸기잼와플.png"));
        JLabel strawberryWaffleLabel = new JLabel("<html> strawberry waffle <br> 3300원 </html>");
        imgStrawberryWaffle.setHorizontalAlignment(JLabel.CENTER);
        strawberryWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        strawberryWaffle.add(imgStrawberryWaffle, BorderLayout.NORTH);
        strawberryWaffle.add(strawberryWaffleLabel, BorderLayout.SOUTH);

        JButton appleWaffle = new JButton();
        appleWaffle.setLayout(new BorderLayout());
        JLabel imgAppleWaffle = new JLabel(functions2.resize2("./images/사과잼와플.png"));
        JLabel appleWaffleLabel = new JLabel("<html> apple waffle <br> 3300원 </html>");
        imgAppleWaffle.setHorizontalAlignment(JLabel.CENTER);
        appleWaffleLabel.setHorizontalAlignment(JLabel.CENTER);
        appleWaffle.add(imgAppleWaffle, BorderLayout.NORTH);
        appleWaffle.add(appleWaffleLabel, BorderLayout.SOUTH);

        
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
       
        
        
        nutellaWaffle.setBackground(Color.WHITE);
        nutellaWaffle.setPreferredSize(new Dimension(150,300));
        pigWaffle.setBackground(Color.WHITE);
        strawberryWaffle.setBackground(Color.WHITE);
        appleWaffle.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(nutellaWaffle);
        menu.add(pigWaffle);
        menu.add(strawberryWaffle);
        menu.add(appleWaffle);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(600, 1000);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        nutellaWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "크런치누텔라와플";
            	Main.beverageNum = 1;
            	Main.price = 3500;
            	Main.bevPrice = 3500;
                new Options9();
                setVisible(false);
            }
        });
        pigWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "크런치피그와플";
            	Main.beverageNum = 1;
            	Main.price = 3800;
            	Main.bevPrice = 3800;
                new Options9();
                setVisible(false);
            }
        });
        strawberryWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "딸기잼와플";
            	Main.beverageNum = 1;
            	Main.price = 3300;
            	Main.bevPrice = 3300;
                new Options9();
                setVisible(false);
            }
        });
        
        appleWaffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "사과잼와플";
            	Main.beverageNum = 1;
            	Main.price = 3300;
            	Main.bevPrice = 3300;
                new Options9();
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