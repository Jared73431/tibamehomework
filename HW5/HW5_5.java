package HW5;

public class HW5_5 {

	public static void main(String[] args) {
//		數字0~9的萬國碼換成十進位值為48~57, 
//		大寫A~Z的萬國碼換成十進位值為65~90,
//		小寫a~z的萬國碼換成十進位值為97~122,
		int i = 0;
		char[] draw = new char[62];
		for(int num = 48; num <= 57; num++) {
			draw[i] = (char)num;
			i++;
		}
		for(int upletter = 65; upletter <= 90; upletter++) {
			draw[i] = (char)upletter;
			i++;
			}
		for(int lowcase = 97; lowcase <= 122; lowcase++) {
			draw[i]=(char)lowcase;
			i++;
		}
		//設定一個random範圍為0 <= index <= draw.length,
		//每抽一次就印出陣列元素8次
		System.out.println("本次隨機產生驗證碼為:");
		for(int count = 0; count < 8; count++) {
			int code =(int)(Math.random() * 62);
			System.out.print(draw[code]);
		}
	}

}
