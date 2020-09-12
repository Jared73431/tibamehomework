package HW10;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class HW10_2 {

	public static void main(String[] args) {
		String Check = "^[.\\d]*$";
		System.out.println("請輸入一組數字:");
		Scanner input = new Scanner(System.in);
		String num = input.next();
		if (num.matches(Check)) {
			System.out.println("請選擇你的表示方法 (1)千分位(2)百分比(3)科學記號");
			Scanner select = new Scanner(System.in);
			String n = select.next();
			String Check2 = "^[123]$";
			if (n.matches(Check2)) {
				switch (Integer.parseInt(n)) {
				case 1:
					NumberFormat nf = NumberFormat.getInstance();
					System.out.println(nf.format(Double.parseDouble(num)));
					break;
				case 2:
					Format dfm1 = new DecimalFormat("#,##00.00%");
					System.out.println(dfm1.format(Double.parseDouble(num)));
					break;
				case 3:
					Format dfm2 = new DecimalFormat("0.##E0");
					System.out.println(dfm2.format(Double.parseDouble(num)));
					break;
				}
			}
		} else
			System.out.println("請輸入數字!!");
	}

}
