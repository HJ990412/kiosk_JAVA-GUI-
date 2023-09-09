package Screens;
import javax.swing.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import func.functions2;

public class Main5 extends JFrame {
	
	public static String name = null;
	public static int beverageNum = 0;
	public static String temp = null;
	public static int shot = 0;
	public static int syrup = 0;
	public static int whipping = 0;
	public static boolean decaf = false;
	public static int price = 0;
	public static int bevPrice = 0;
	
	
	public Main5() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴선택창5");
		
		Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(new Color(238,238,238));
        
        JPanel category = new JPanel(new GridLayout(1,5));
        
        JButton coffeeTab = new JButton("커피");
        JButton teaTab = new JButton("티");
        JButton adeTab = new JButton("에이드");
        JButton waffleTab = new JButton("와플");
        JButton smoothieTab = new JButton("스무디");
        
        
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
                new Main();
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
                new Main2();
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
                new Main3();
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
                new Main4();
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
                new Main5();
                setVisible(false);
            }
        });
        
        category.add(coffeeTab);
        category.add(teaTab);
        category.add(adeTab);
        category.add(waffleTab);
        category.add(smoothieTab);
        
        JPanel menu = new JPanel(new GridLayout(2, 2));
        
        JButton cacaoFrappe = new JButton();
        JButton cookieFrappe = new JButton();
        JButton coconutSmoothie = new JButton();
        JButton blueberrySmoothie = new JButton();

        cacaoFrappe.setLayout(new BorderLayout());
        JLabel imgCacaoFrappe = new JLabel(functions2.resize2("./images/블랙카카오프라페.png"));
        JLabel cacaoFrappeLabel = new JLabel("<html> 블랙 카카오 프라페 <br> 3400원 </html>");
        imgCacaoFrappe.setHorizontalAlignment(JLabel.CENTER);
        cacaoFrappeLabel.setHorizontalAlignment(JLabel.CENTER);
        cacaoFrappe.add(imgCacaoFrappe, BorderLayout.NORTH);
        cacaoFrappe.add(cacaoFrappeLabel, BorderLayout.SOUTH);

        cookieFrappe.setLayout(new BorderLayout());
        JLabel imgCookieFrappe = new JLabel(functions2.resize2("./images/쿠앤크프라페.png"));
        JLabel cookieFrappeLabel = new JLabel("<html> 쿠앤크 프라페 <br> 3600원 </html>");
        imgCookieFrappe.setHorizontalAlignment(JLabel.CENTER);
        cookieFrappeLabel.setHorizontalAlignment(JLabel.CENTER);
        cookieFrappe.add(imgCookieFrappe, BorderLayout.NORTH);
        cookieFrappe.add(cookieFrappeLabel, BorderLayout.SOUTH);

        coconutSmoothie.setLayout(new BorderLayout());
        JLabel imgCoconutSmoothie = new JLabel(functions2.resize2("./images/코코넛스무디.png"));
        JLabel coconutSmoothieLabel = new JLabel("<html> 코코넛 스무디 <br> 3300원 </html>");
        imgCoconutSmoothie.setHorizontalAlignment(JLabel.CENTER);
        coconutSmoothieLabel.setHorizontalAlignment(JLabel.CENTER);
        coconutSmoothie.add(imgCoconutSmoothie, BorderLayout.NORTH);
        coconutSmoothie.add(coconutSmoothieLabel, BorderLayout.SOUTH);

        blueberrySmoothie.setLayout(new BorderLayout());
        JLabel imgBlueberrySmoothie = new JLabel(functions2.resize2("./images/블루베리스무디.png"));
        JLabel blueberrySmoothieLabel = new JLabel("<html> 블루베리 스무디 <br> 3300원 </html>");
        imgBlueberrySmoothie.setHorizontalAlignment(JLabel.CENTER);
        blueberrySmoothieLabel.setHorizontalAlignment(JLabel.CENTER);
        blueberrySmoothie.add(imgBlueberrySmoothie, BorderLayout.NORTH);
        blueberrySmoothie.add(blueberrySmoothieLabel, BorderLayout.SOUTH);
        
        JButton getlargeBtn = new JButton("글자크게");
        getlargeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFontSize(c); // 글꼴 크기 증가 메서드 호출
            }
        });
        
        JButton getSmallBtn = new JButton("글자작게");
        getSmallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseFontSize(c);
            }
        });
        
        JPanel basket = new JPanel();
        JButton basket_btn = new JButton("장바구니");
        basket_btn.setBackground(new Color(0, 85, 67));
        basket_btn.setForeground(Color.BLACK);
        basket.add(getlargeBtn);
        basket.add(basket_btn);
        basket.add(getSmallBtn);
       
        
        cacaoFrappe.setBackground(Color.WHITE);
        cacaoFrappe.setPreferredSize(new Dimension(150,300));
        cookieFrappe.setBackground(Color.WHITE);
        coconutSmoothie.setBackground(Color.WHITE);
        blueberrySmoothie.setBackground(Color.WHITE);
        basket_btn.setBackground(new Color(0,85,67));
        basket_btn.setForeground(Color.WHITE);
        
        menu.add(cacaoFrappe);
        menu.add(cookieFrappe);
        menu.add(coconutSmoothie);
        menu.add(blueberrySmoothie);
        
        c.add(category, BorderLayout.NORTH);
        c.add(menu);
        c.add(basket, BorderLayout.SOUTH);
        
        setSize(600,1080);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);
        
        cacaoFrappe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "블랙카카오프라페";
            	Main.beverageNum = 1;
            	Main.price = 3400;
            	Main.bevPrice = 3400;
                new Options5();
                setVisible(false);
                
                
            }
        });
        cookieFrappe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "쿠앤크프라페";
            	Main.beverageNum = 1;
            	Main.price = 3600;
                Main.bevPrice = 3600;
                new Options5();
                setVisible(false);
                
                
            }
        });
        coconutSmoothie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "코코넛스무디";
            	Main.beverageNum = 1;
            	Main.price = 3300;
            	Main.bevPrice = 3300;
                new Options5();
                setVisible(false);
                
                
            }
        });
        
        blueberrySmoothie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = "블루베리스무디";
            	Main.beverageNum = 1;
            	Main.price = 3300;
            	Main.bevPrice = 3300;
                new Options5();
                setVisible(false);
                
                
            }
        });
        
        basket_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Basket();
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