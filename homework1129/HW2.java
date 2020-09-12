package homework1129;

public class HW2 {
	public static void main(String[] args) {
//			1-1000的偶數和
			int sum = 1;
			for(int count = 1; count <= 1000; count++) {
				if(count%2 == 0)sum += count;
			}
			System.out.println("1～1000的偶數和 = " + sum);
			//1-10的積數和(for)
			int sumx1 = 1;
			for(int countx1 = 1; countx1 <= 10; countx1++) {
				sumx1 *= countx1;
			}
			System.out.println("1～10的積數和 = " + sumx1);
			//1-10的積數和(while)
			int sumx2 = 1;
			int countx2 = 1;
			while (countx2<=10) {
				sumx2*=countx2;
				countx2++;
			}
			System.out.println("1～10的積數和 = " + sumx1);
			//1 4 9 16 25 36 49 64 81 的規律
			int y = 1;
			for (int i = 1;i<=10;i++) {
				System.out.print(i*i + " ");
			}
			System.out.println(" ");
			//不要輸出含有4的數字(1-49)
			final int nonum = 4;
			int total = 0;
			System.out.println("可以選擇的數字有 ： ");
			for(int i = 1; i <= 49; i++) {
				if((i / 10 == nonum) || (i % 10 == nonum))continue;//  "/"取整數 "%"取餘數 "||"為或
				else{
					System.out.print(i + "\t");
					total++;//總數+1
				}
				if(total % 8 == 0)System.out.println();//一行顯示的數目,餘0跳下一行否則繼續
			}
			System.out.println();
			System.out.println("總共有" + total + "個");
			
			System.out.println();
			//輸出倒三角形用數字
			for(int h = 1; h <= 10; h++) {
				for(int s = 1; s <= (11 - h); s++) {
					System.out.print(s + " ");
				}
				System.out.println();
			}
			System.out.println();
			//請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
			char alphabet = 'A';//char為字元型別可運算
			for(int h = 1; h <= 6; h++) {//橫數判斷
				for(int s = 1; s <= h; s++) {//直數判斷
					System.out.print(alphabet );
				}
				System.out.println();
				alphabet +=1;
			}
			
	}
		
		
}
