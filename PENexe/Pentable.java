package PENexe;

public abstract class Pentable implements IWriteable{
	 protected String brand;
	 protected double price;
//	Constructor
	public Pentable() {
		
	}
//	Constructor
	public Pentable(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract void write();
	

}
