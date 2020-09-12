package HW6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caltest {
	public static void main(String[] args) {
		while (true) {

			try {
				int x, y;

				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值");
				x = Integer.parseInt(sc.next());
				System.out.println("請輸入y的值");
				y = Integer.parseInt(sc.next());

				System.out.println(x+"的"+y+"次方為"+powerXY(x, y));
			} catch (CalException ce) {
				System.out.println(ce.getMessage());
			} catch (NumberFormatException n) {
				System.out.println("輸入格式錯誤");
			}
		}

	}

	public static int powerXY(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("0與0的平方沒有意義");
		} else if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		} else {
			int result = (int) Math.pow(x, y);
			return result;
			
		}

	}
}
