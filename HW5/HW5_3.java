package HW5;

import java.util.ArrayList;
import java.util.Collections;

public class HW5_3 {

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		double[][] dArry = { { 9.0, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		System.out.println("intArray中最大為" + maxElement(intArray));
		System.out.println("doubleArray中最大為" + maxElement(doubleArray));
		System.out.println("doubleArray中最大為" + maxElement(dArry));
	}

	public static int maxElement(int x[][]) {
		int max = 0;
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length ; j++ ) {
					if(x[i][j] > max)
						max = x[i][j];
				}
			} return max;
		}
		public static double maxElement(double x[][]) {
		double max = 0;
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length ; j++ ) {
					if(x[i][j] > max)
						max = x[i][j];	
			
				}
			}return max ;
		}	
}
