package HW3;

import java.util.Scanner;

public class HW3_2 {
//配合作業3-2猜數字進階版
	public static void main(String[] args) {
		int rightAns = (int)(Math.random() * 100);
		System.out.println("請輸入0-9之間數字");
		
		Scanner sc = new Scanner(System.in);
		int yourAns = sc.nextInt();
		int upperNum = 100;
		int lowerNum = 0;
		
		while(rightAns != yourAns) {
			if(yourAns > rightAns) {
				upperNum = yourAns;
			}else {
				lowerNum = yourAns;
			}
			System.out.println("介於" + lowerNum +"~"+ upperNum);
			yourAns = sc.nextInt();
		}
		System.out.println("答對囉 答案就是" + rightAns);
	}

	}


