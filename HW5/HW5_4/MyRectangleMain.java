package HW5.HW5_4;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle ang = new MyRectangle();
		ang.setDepth(10);
		ang.setWidth(20);
		MyRectangle ang1 = new MyRectangle(10,20);
		System.out.println("ang面積為"+ang.getArea());
		System.out.println("ang1面積為"+ang1.getArea());
		

	}

}
