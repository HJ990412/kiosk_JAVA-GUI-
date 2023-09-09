package Device;

import java.util.ArrayList;

import Info.Coffee;

public interface PurchaseOrder {
	public abstract void sendOrder(int OrderNum, ArrayList<Coffee> orderList);
	public abstract void sendHelp();
}

