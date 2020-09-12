package HW4;

import java.util.Scanner;

public class HW4_5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		operation();
		operation();
		operation();

	}

	public static void operation() {
		int[] day = { 30, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int year, month, date;
		System.out.println("輸入日期,空格分開");
		year = sc.nextInt();
		month = sc.nextInt();
		date = sc.nextInt();
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			day[1] = 28;
		}

		if (date > day[month - 1]) {
			System.out.println("輸入錯誤");
		} else {
			System.out.println("你輸入的是" + year + "年" + month + "月" + date + "日");
		}
		int sumday = 0;
		sumday += date;
		for (int i = 0; i <= month - 1; i++) {
			if (i == 0) {
				continue;
			} else {
				sumday += day[i];
			}
		}

		System.out.println("西元" + year + "年第" + sumday + "天");

	}

}
