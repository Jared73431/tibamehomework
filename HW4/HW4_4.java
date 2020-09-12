package HW4;

import java.util.Scanner;

public class HW4_4 {

	public static void main(String[] args) {
		Scanner board = new Scanner(System.in);
		System.out.println("你要借多少錢:");
		int mon = board.nextInt();
		int[][]id = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
		int sum = 0;
		for (int i = 0; i<=id.length-1;i++) {
			if (id[i][1]>=mon) {//i為25,32,8,14,27,陣列表示元素
				sum +=1;
			}
		}
		System.out.println("可借的員工");
		for(int i=0;i<=id.length-1;i++){
			if(id[i][1]>=mon){
				System.out.print(id[i][0]+" ");
				}
		}
		System.out.print("總共"+sum+"位");
	}

}
