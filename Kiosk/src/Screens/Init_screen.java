package Screens;
import javax.swing.*;

import Device.PosDevice;
import Device.PurchaseOrder;
import Info.Coffee;
import func.functions2;
import func.functions3;

import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class Init_screen extends JFrame {
	public static ArrayList<Coffee> orderList = new ArrayList<>();
	
	public Init_screen() {
		
		
		setTitle("첫화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		   
		
		JPanel Init_north = new JPanel(new FlowLayout());
		Init_north.setBackground(new Color(0,216,255));
		c.add(Init_north,BorderLayout.NORTH);
		  
		
		JPanel Init_south = new JPanel(new GridLayout());         
		Init_south.setBackground(new Color(0,216,255)); 
		c.add(Init_south,BorderLayout.SOUTH);
		
		JPanel Init_background = new JPanel(new GridLayout()); 
		Init_background.setBackground(Color.white);
		JLabel logo = new JLabel (functions3.resize3("./images/로고.jpg")); 
		Init_background.add(logo);
		c.add(Init_background);
	
		
		JButton eatin_btn = new JButton("주문시작!");
		eatin_btn.setFont(new Font("Dialog", Font.BOLD, 40)); 
		Init_south.add(eatin_btn, BorderLayout.CENTER);
		
		eatin_btn.setBackground(Color.WHITE);
        eatin_btn.setForeground(Color.BLACK);

		JButton helpButton = new JButton("도움말");
		helpButton.setFont(new Font("Dialog", Font.BOLD, 40)); 
		helpButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        new HelpScreen();
		    }
		});
		
		helpButton.setBackground(Color.WHITE);
        helpButton.setForeground(Color.BLACK);


		Init_south.add(helpButton, BorderLayout.EAST);   
		  
		JButton callButton = new JButton("직원 호출");
        callButton.setFont(new Font("Dialog", Font.BOLD, 40));
        callButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JOptionPane.showMessageDialog(Init_screen.this, "직원을 호출합니다.", "직원 호출", JOptionPane.INFORMATION_MESSAGE);
            	PurchaseOrder posDev = new PosDevice();
            	posDev.sendHelp();
            }
        });
        
        JButton engOrderButton = new JButton("ENG ORDER");
		engOrderButton.setFont(new Font("Dialog", Font.BOLD, 40));
		engOrderButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        new Main6();
		        setVisible(false);
		    }
		});
		
        Init_north.add(callButton);
        callButton.setBackground(Color.WHITE);
        callButton.setForeground(Color.BLACK);

			  
		eatin_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
                setVisible(false);

            }
        });
		
		
		
		engOrderButton.setBackground(Color.WHITE);
        engOrderButton.setForeground(Color.BLACK);      	    	      
			      
        Init_north.add(engOrderButton);
	   
		setSize(600, 1080);
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Init_screen();

	}

}
