package Info;
public class Coffee {
	
	private String name;
	private int beverageNum;
	private String temp;
	private int shot;
	private int syrup;
	private int whipping;
	private boolean decaf;
	private int price;
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public int getBeverageNum() {
		return beverageNum;
	}
	
	public void setBeverageNum() {
		this.beverageNum = beverageNum;
	}
	
	public String getTemp() {
		return temp;
	}
	
	public void setTemp() {
		this.temp = temp;
	}
	
	public int getShot() {
		return shot;
	}
	
	public void setShot() {
		this.shot = shot;
	}
	
	public int getSyrup() {
		return syrup;
	}
	
	public void setSyrup() {
		this.syrup = syrup;
	}
	
	public int getWhipping() {
		return whipping;
	}
	
	public void setWhipping() {
		this.whipping = whipping;
	}
	
	public boolean getDecaf() {
		return decaf;
	}
	
	public void setDecaf(boolean decaf) {
		this.decaf = decaf;
	}
	
	public boolean isDecaf() {
		return decaf;
	}
	
	public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Coffee(String name, int beverageNum, String temp, int shot, int syrup, 
    		int whipping, boolean decaf, int price) {
    	this.name = name;
    	this.beverageNum = beverageNum;
    	this.temp = temp;
    	this.shot = shot;
    	this.syrup = syrup;
    	this.whipping = whipping;
    	this.decaf = decaf;
    	this.price = price;
    }
    		

}
