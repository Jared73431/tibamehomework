package HW3;

import java.util.Scanner;

public class HW3_1 {
	static Scanner kyb = new Scanner(System.in);
	public static void main(String[] args) {
		while(true)
		operation();
		}
	public static void operation() {
        int a, b, c;

        System.out.print("請輸入三個整數：");
        a = kyb.nextInt();
        b = kyb.nextInt();
        c = kyb.nextInt();

        if ( (a+b>c) && (b+c>a) && (c+a>b) ) {
        	if((a==b)&&(b==c)&(c==a)) {
                System.out.printf("正三角形\n");
        	}
        	else if(((a==b)||(a==c)||(a==c))&&((a*a+b*b==c*c)||(c*c+b*b==a*a)||(a*a+c*c==b*b))) {
        		System.out.println("這是一個等腰直角三角形");
        	}
        	else if((a==b)||(b==c)||(a==c)) {
        		System.out.println("這是一個等腰三角形");
        	}
        	else if ( (a*a+b*b==c*c) || (b*b+c*c==a*a) || (c*c+a*a==b*b) ) {
                System.out.printf("直角三角形\n");
            }
            else if ( (a*a+b*b<c*c) || (b*b+c*c<a*a) || (c*c+a*a<b*b) ) {
                System.out.printf("鈍角三角形\n");
            }
            else {
                System.out.printf("銳角三角形\n");
            }
        } else {
            System.out.printf("不可以構成三角形\n");
        }
    }

}
