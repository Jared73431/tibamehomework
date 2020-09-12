package HW4;

import java.util.Arrays;

public class HE4_6 {

	public static void main(String[] args) {
		int[][] scores = {{10,35,40,100,90,85,75,70},
				  {37,75,77,89,64,75,70,95},
				  {100,70,79,90,75,70,79,90},
				  {77,95,70,89,60,75, 85,89},
				  {98,70,89,90,75,90,89,90},
				  {90,80, 100,75,50,20,99,75}};
int[] wins= new int[8];
		
		for(int i=0;i<scores.length;i++){
			int[] ranks= Arrays.copyOf(scores[i], scores[i].length);//複製
			Arrays.sort(ranks);//排序
			int max = ranks[ranks.length-1];
			System.out.print("第"+(int)(i+1)+"次這次最高分是");
			for(int n=0;n<scores[i].length;n++){	
				if (max == scores[i][n]){
					System.out.println("由"+(int)(i+1)+"號同學所得");/*複製陣列做排序,再把排序的值和原本的比較
					                                              
					                                              */
					wins[n] +=1;
				}
			}
		}
		for(int i=0; i<wins.length;i++){
			System.out.println((int)(i+1)+"號同學得到最高分次數為"+wins[i]);
		}


	}

}
