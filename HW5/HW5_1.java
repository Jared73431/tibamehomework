package HW5;

import java.util.Scanner;

public class HW5_1 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("輸入高寬");
		int weigh = src.nextInt();
		int heigh = src.nextInt();
		starSquare(weigh, heigh);
	}
	static void starSquare(int weigh,int heigh) {
		String [][] star = new String[weigh][heigh];
		for (int i=0;i<=star.length-1;i++){
			for (int j=0;j<=star[i].length-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
