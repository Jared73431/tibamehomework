package PENexe;

public class Pencil extends Pentable{
	public Pencil (String brand,double price) {
		this.brand = brand;
		this.price = (int)(price);
	}
	@Override
	public void write() {
		System.out.println("削鉛筆在寫");
		
	}


	
}
