package HW10;

public class HW10_1 {

	public static void main(String[] args) {
		for (int i = 0; i<5; i++) {
			boolean prime = false;
			int r = (int) (Math.round(Math.random()*99)+1);
			for(int j= 2; j<=(r/2);j++) {
				if (r%j==0) {
					prime=true;
				}
			}
			if( prime == true || r==1) {
				System.out.println(r+"不是質數");
			}
			else 
				System.out.println(r+"是質數");
			}

	}

}
