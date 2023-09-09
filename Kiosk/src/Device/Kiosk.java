package Device;
import javax.swing.JFrame;

import Screens.CardInput1;
import Screens.Init_screen;
import Screens.Loading;

public class Kiosk extends JFrame{
	
    
	private static OrderNumber orderNum;
	private static PaymentReq payReq;
	private static PurchaseOrder posDev;
	private String cardNumber;
	private String expiryYear;
	private String expiryMonth;
	
	public Kiosk(OrderNumber orderNum, PaymentReq payReq, PurchaseOrder posDev, String cardNumber, String expiryYear, String expiryMonth) {
	    this.orderNum = orderNum;
	    this.payReq = payReq;
	    this.posDev = posDev;
	    this.cardNumber = cardNumber;
	    this.expiryYear = expiryYear;
	    this.expiryMonth = expiryMonth;
	    
	   
		
		boolean res = payReq.sendPaymentReq(Integer.parseInt(cardNumber), Integer.parseInt(expiryYear), Integer.parseInt(expiryMonth));
		
		if (res == true) {
			String orderNumber = null;
			for (int i = 0; i < 50; i++) {
				if(payReq.receivePaymentRes() == PaymentReq.RES_WAIT) {
					continue;
				} else if(payReq.receivePaymentRes() == PaymentReq.RES_SUCCESS) {
					System.out.println("결제성공");
					orderNumber = Integer.toString(orderNum.getOrderNumber());
				    new OrderManage(orderNumber);
					break;
				}
			}
			posDev.sendOrder(Integer.parseInt(orderNumber),Init_screen.orderList);
		}
		else new CardInput1();
	}

}