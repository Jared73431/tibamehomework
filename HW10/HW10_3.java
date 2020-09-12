package HW10;

import java.util.Scanner;

public class HW10_3 {

	public static void main(String[] args) {
		/*
		 * 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後， 可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一，
		 * 而輸入非指定日期數字格式會顯示出提示訊息如圖 (提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)
		 */

		System.out.println("請輸入日期(西元年月日，例如:20110131)");
		Scanner input = new Scanner(System.in);
		// 訂立正則表示式
		String date = input.next();
		StringBuffer type = new StringBuffer(); // 空的位置讓切割好的字串可以拼接放入
		String year = date.substring(0,4);
		String month = date.substring(4,6);
		String day = date.substring(6,8);

		String checkYear = "^\\d{4}$";
		String checkMonth = "^[0][1-9]|[1][0-2]$";
		String checkDay = "^[0][1-9]|[1][0-9]|[2][0-9]|[3][0-1]$";

		if ((year.toString()).matches(checkYear) && (month.toString()).matches(checkMonth)
				&& (day.toString()).matches(checkDay)) {

			System.out.println("請選擇你要的輸出格式");
			System.out.println("(1)年/月/日 , (2)月/日/年 , (3)日/月/年");
			int select = input.nextInt();
			switch (select) {
			case 1:
				type.append(year + "/" + month + "/" + day);
				break;
			case 2:
				type.append(month + "/" + day + "/" + year);
				break;
			case 3:
				type.append(day + "/" + month + "/" + year);
				break;
			}
			System.out.println(type);
		} else
			System.out.println("請參照範例西元年4碼,月份2碼,日期2碼 並遵守基本原則 謝謝~");
	}

}
