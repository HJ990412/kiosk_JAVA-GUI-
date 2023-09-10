package Screens;
import javax.swing.*;

import func.functions;
import java.awt.*;
import java.awt.event.*;
import static Screens.Main.*;
import Info.Coffee;

import static Screens.Init_screen.orderList;

public class Options10 extends JFrame{
	private JButton plus_btn = new JButton("+");
    private JButton minus_btn = new JButton("-");
    private JLabel bev_num = new JLabel("      " + Main.beverageNum);
    private JLabel cur_price = new JLabel("     " + Main.price);
    private JButton hot_btn = new JButton("HOT");
    private JButton iced_btn = new JButton("ICED");
    private JLabel L500 = new JLabel("500 won");
    private JLabel L1000 = new JLabel("1000 won");
    private JLabel Lshot = new JLabel("plus shot");
    private JButton shot_plus_btn = new JButton("+");
    private JButton shot_minus_btn = new JButton("-");
    private JLabel shot_num = new JLabel("      " + Main.shot);
    private JLabel Lsyrup = new JLabel("plus vanilla syrup");
    private JButton syrup_plus_btn = new JButton("+");
    private JButton syrup_minus_btn = new JButton("-");
    private JLabel syrup_num = new JLabel("      " + Main.syrup);
    private JLabel Lwhipping = new JLabel("plus whipping");
    private JButton whipping_plus_btn = new JButton("+");
    private JButton whipping_minus_btn = new JButton("-");
    private JLabel whipping_num = new JLabel("      " + Main.whipping);
    private JLabel Ldecaf = new JLabel("change to decaf");
    private JButton caf_btn = new JButton("decaffeine (+1000 won)");
    private JButton decaf_btn = new JButton("caffeine");
    
    
    public Options10() {
        
        setTitle("옵션추가");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 1000);
        setLocationRelativeTo(null);
        
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(8,1));
        
        JPanel header = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String imagePath = String.format("./images/%s.png", Main.name);
        ImageIcon icon = new ImageIcon(imagePath);
        JLabel name = new JLabel(Main.name);
        JLabel label = new JLabel(icon);
        JLabel image = new JLabel(functions.resize(imagePath));
        
        JButton cancel_btn = new JButton("cancel");
        JButton orderDone_btn = new JButton("done");
        
        JPanel optionsUI = new JPanel(new FlowLayout(FlowLayout.CENTER));
        optionsUI.add(image);
        optionsUI.add(name);
        
        plus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.beverageNum++;
                Main.price += Main.bevPrice;
                bev_num.setText("      " + Main.beverageNum);
                cur_price.setText("      " + Main.price);
            }
        });

        minus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.beverageNum > 1) {
                    Main.beverageNum--;
                    Main.price -= Main.bevPrice;
                    bev_num.setText("      " + Main.beverageNum);
                    cur_price.setText("      " + Main.price);
                }
            }
        });
        
        hot_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hot_btn.setBackground(Color.RED);
                hot_btn.setForeground(Color.WHITE);
                iced_btn.setBackground(null);
                iced_btn.setForeground(null);
                Main.temp = "hot";
            }
        });

        iced_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iced_btn.setBackground(Color.BLUE);
                iced_btn.setForeground(Color.WHITE);
                hot_btn.setBackground(null);
                hot_btn.setForeground(null);
                Main.temp = "iced";
            }
        });
        
        shot_plus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.shot++;
                shot_num.setText("      " + Main.shot);
                Main.price += 500;
                cur_price.setText("      " + Main.price);
            }
        });

        shot_minus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.shot > 0 && Main.price >= Main.bevPrice ) {
                    Main.shot--;
                    shot_num.setText("      " + Main.shot);
                    Main.price -= 500;
                    cur_price.setText("      " + Main.price);
                }
            }
        });
        
        syrup_plus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.syrup++;
                syrup_num.setText("      " + Main.syrup);
                Main.price += 500;
                cur_price.setText("      " + Main.price);
            }
        });

        syrup_minus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.syrup > 0 && Main.price >= Main.bevPrice) {
                    Main.syrup--;
                    syrup_num.setText("      " + Main.syrup);
                    Main.price -= 500;
                    cur_price.setText("      " + Main.price);
                }
            }
        });
        
        whipping_plus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.whipping++;
                whipping_num.setText("      " + Main.whipping);
                Main.price += 500;
                cur_price.setText("      " + Main.price);
            }
        });

        whipping_minus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.whipping > 0 && Main.price >= Main.bevPrice) {
                    Main.whipping--;
                    whipping_num.setText("      " + Main.whipping);
                    Main.price -= 500;
                    cur_price.setText("      " + Main.price);
                }
            }
        });
        
        caf_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caf_btn.setBackground(Color.BLUE);
                caf_btn.setForeground(Color.WHITE);
                decaf_btn.setBackground(null);
                decaf_btn.setForeground(null);
                Main.decaf = true;
                Main.price += 1000;
                cur_price.setText("      " + Main.price);
            }
        });

        decaf_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Main.decaf == true) {
                	decaf_btn.setBackground(Color.BLUE);
                    decaf_btn.setForeground(Color.WHITE);
                    caf_btn.setBackground(null);
                    caf_btn.setForeground(null);
                    Main.decaf = false;
                    Main.price -= 1000;
                    cur_price.setText("      " + Main.price);
                }
            }
        });
        
        orderDone_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                    Coffee coffee = new Coffee(Main.name, Main.beverageNum, Main.temp, Main.shot, Main.syrup, Main.whipping, Main.decaf, Main.price);
                    orderList.add(coffee);
                    Main.name = null; 
                    Main.beverageNum = 0; 
                    Main.temp = null; 
                    Main.shot = 0; 
                    Main.syrup = 0; 
                    Main.whipping = 0; 
                    Main.decaf = false; 
                    Main.price = 0;
                    new Main6();
                    setVisible(false);
                
            }
        });
        
        cancel_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Main.name = null; 
                Main.beverageNum = 0; 
                Main.temp = null; 
                Main.shot = 0; 
                Main.syrup = 0; 
                Main.whipping = 0; 
                Main.decaf = false; 
                Main.price = 0;
                new Main6();
                setVisible(false);
            }
        });
        
        JPanel bevNum = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bevNum.add(minus_btn);
        bevNum.add(bev_num);
        bevNum.add(plus_btn);
        bevNum.add(cur_price);

        JPanel tempPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        tempPanel.add(hot_btn);
        tempPanel.add(iced_btn);

        JPanel shotPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        shotPanel.add(Lshot);
        shotPanel.add(new JLabel());
        shotPanel.add(new JLabel("500 won"));
        shotPanel.add(shot_minus_btn);
        shotPanel.add(shot_num);
        shotPanel.add(shot_plus_btn);

        JPanel syrupPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        syrupPanel.add(Lsyrup);
        syrupPanel.add(new JLabel());
        syrupPanel.add(new JLabel("500 won"));
        syrupPanel.add(syrup_minus_btn);
        syrupPanel.add(syrup_num);
        syrupPanel.add(syrup_plus_btn);
        
        JPanel whippingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        whippingPanel.add(Lwhipping);
        whippingPanel.add(new JLabel());
        whippingPanel.add(new JLabel("500 won"));
        whippingPanel.add(whipping_minus_btn);
        whippingPanel.add(whipping_num);
        whippingPanel.add(whipping_plus_btn);

        JPanel decafPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        decafPanel.add(Ldecaf);
        decafPanel.add(caf_btn);
        decafPanel.add(decaf_btn);
        
        JButton getlargeBtn = new JButton("bigger letters");
        getlargeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFontSize(c); // 글꼴 크기 증가 메서드 호출
            }
        });
        
        JButton getSmallBtn = new JButton("smaller letters");
        getSmallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseFontSize(c);
            }
        });
        
        JPanel cancelPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cancelPanel.add(getlargeBtn);
        cancelPanel.add(cancel_btn);
        cancelPanel.add(orderDone_btn);
        cancelPanel.add(getSmallBtn);

        orderDone_btn.setBackground(Color.WHITE);
        orderDone_btn.setForeground(Color.BLACK);
        
        cancel_btn.setBackground(Color.WHITE);
        cancel_btn.setForeground(Color.BLACK);
        
        getSmallBtn.setBackground(Color.WHITE);
        getSmallBtn.setForeground(Color.BLACK);
        
        getlargeBtn.setBackground(Color.WHITE);
        getlargeBtn.setForeground(Color.BLACK);
  
        
        c.add(optionsUI);
        c.add(bevNum);
        c.add(cancelPanel);
       
        
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