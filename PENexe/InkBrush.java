package PENexe;

public class InkBrush extends Pentable{
	public InkBrush (String brand,double price) {
		this.brand = brand;
		this.price = (int)(price*0.9);
	}
	@Override
	public void write() {
		System.out.println("沾墨汁在寫");
		
	}

}
