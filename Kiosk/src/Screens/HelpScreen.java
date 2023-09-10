package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpScreen extends JFrame {
    public HelpScreen() {
        setTitle("도움말");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 1000);
        setLocationRelativeTo(null);
        
        
        
        JLabel help1 = new JLabel("<html> 1. 드시고 싶은 음료를 선택해주세요.</html>");
        JLabel help2 = new JLabel("<html> 2. 원하시는 옵션을 추가해주시면 됩니다.</html>");
        JLabel help3 = new JLabel("<html> Ice- 차갑게 얼음을 넣어드립니다. <br> Hot-뜨겁게 해드립니다. <br> 바닐라시럽- 설탕보다 더 달게 바닐라 맛이 나는 시럽을 넣어드립니다. "
        		+ "<br> 샷추가 - 샷을 추가하여 커피를 좀더 진하게 만들어드립니다. <br> 휘핑크림추가 - 휘핑크림을 음료 위에 올려드립니다. <br> 디카페인-카페인 함량이 적게 만들어드립니다.</html>");
        
        JLabel help4 = new JLabel("<html> 3. 장바구니에 담긴 음료를 시키신 음료가 맞는지 확인해주세요. </html>");
        JLabel help5 = new JLabel("<html> 4. 주문하실 음료가 맞으시면 결제하기 버튼을 눌러주세요. </html>");
        JLabel help6 = new JLabel("<html> 5. 결제하실 카드번호 유효기간을 차례로 입력 후 화면에 표시된 주문번호를 확인후 기다려주세요. </html>");
        JLabel help7 = new JLabel("<html> ** 혹시 도움이 필요하시면 언제든 직원 호출 버튼을 눌러주세요! <br> 점원이 나와서 주문을 도와드리겠습니다!!!^^** </html>");
        
        help1.setHorizontalAlignment(SwingConstants.CENTER);
        help2.setHorizontalAlignment(SwingConstants.CENTER);
        help3.setHorizontalAlignment(SwingConstants.CENTER);
        help4.setHorizontalAlignment(SwingConstants.CENTER);
        help5.setHorizontalAlignment(SwingConstants.CENTER);
        help6.setHorizontalAlignment(SwingConstants.CENTER);
        help7.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        JPanel helpPanel = new JPanel();
        helpPanel.setLayout(new GridLayout(7,1));
        
        helpPanel.add(help1);
        helpPanel.add(help2);
        helpPanel.add(help3);
        helpPanel.add(help4);
        helpPanel.add(help5);
        helpPanel.add(help6);
        helpPanel.add(help7);
        
        
        
        JButton closeButton = new JButton("닫기");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(helpPanel, BorderLayout.CENTER);
        panel.add(closeButton, BorderLayout.SOUTH);
        
        add(panel);
        setVisible(true);
    }
}
