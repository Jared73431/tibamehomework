package HW3;

import java.util.Scanner;

public class HW3_3 {
	public static void main(String[] args) {
		Scanner hat = new Scanner(System.in);
		System.out.println("阿文,請輸入討厭的數字");
		final int hatenum = hat.nextInt();
		int total = 0;
		for(int i = 1; i <= 49; i++) {
			if((i / 10 == hatenum) || (i % 10 == hatenum))continue;//  "/"取整數 "%"取餘數 "||"為或
			else{
				System.out.print(i + "\t");
				total++;//總數+1
			}
			if(total % 8 == 0)System.out.println();
		}
		System.out.println();
		System.out.println("總共有" + total + "個");
		
		System.out.println();
	}

}
