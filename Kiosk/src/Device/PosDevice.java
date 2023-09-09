package Device;

import java.util.ArrayList;

import javax.swing.JLabel;

import Info.Coffee;
import Screens.Init_screen;

public class PosDevice implements PurchaseOrder{
	public static int sumPrice = 0;
	@Override
	public void sendOrder(int OrderNum, ArrayList<Coffee> orderList) {
	    System.out.println("Order[" + OrderNum + "]:");

	    for(int i=0; i<Init_screen.orderList.size(); i++) {
	    	Coffee basket_list = Init_screen.orderList.get(i);
	    	
	    	System.out.println(basket_list.getName() + " " + basket_list.getBeverageNum() + "잔");
	    	if (basket_list.getTemp() != null) {
	    	System.out.println(basket_list.getTemp());
	    	}
	    	if (basket_list.getShot() > 0) {
	    	    System.out.println("샷추가 " + basket_list.getShot() + "번");
	    	}
	    	if (basket_list.getSyrup() > 0) {
	    	    System.out.println("바닐라시럽추가 " + basket_list.getSyrup() + "번");
	    	}
	    	if (basket_list.getWhipping() > 0) {
	    	    System.out.println("휘핑추가 " + basket_list.getWhipping() + "번");
	    	}
	    	if (basket_list.getDecaf() == true) {
	    	    System.out.println("디카페인 원두변경");
	    	}
	    	sumPrice += basket_list.getPrice();
	    	
	    	System.out.println("-------------------");

	    }
	    System.out.println("결제 금액: " + sumPrice + "원");
	}

	public void sendHelp() {
		System.out.println("키오스크에서 직원을 호출하였습니다.");
	}

}
