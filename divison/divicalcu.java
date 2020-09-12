package divison;

public class divicalcu {
	private double a;
	private double b;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return a +"/"+ b +"="+ (int)(a/b)+"........."+ a%b ;
		
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		
		this.a = a;
		
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public divicalcu(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

}
