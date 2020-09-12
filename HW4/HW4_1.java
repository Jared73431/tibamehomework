package HW4;

public class HW4_1 {
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {

		  int[] data = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		  int sum = 0;
		  for(int n=0; n<data.length;n++ ){
				sum +=data[n];
			}//相加
		  System.out.println("總共"+sum);
		  int avag = (sum/data.length);
		  System.out.println("平均值"+avag);//平均52
		  System.out.println("大於平均值的有");
		  for(int n=0 ; n<=data.length-1; n++) {
			  if(data[n] >= avag)
			  {
				  System.out.print(data[n]+" ");
			  }
		  }
		  System.out.println();

		 }
	}


