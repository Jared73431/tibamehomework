package HW4;

public class HW4_2 {
	//請建立一個字串,經過程式執行後,輸入結果是反過來的
	public static void main(String[] args) {
		String hello = "Hello World";
		  int length = hello.length()-1;
		  for(int i = length ; i>=0 ;i-- ) {
			  System.out.print(hello.charAt(i));
		  }
		 }

	}


