package HW7;

import java.io.*;

public class HW7_1 {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("sample.txt");
		FileInputStream fis = new FileInputStream(inputFile);
		int count = 0;
		while ((fis.read()) != -1) {
			count += 1;
		}
		System.out.println(count + "位元組");
		fis.close();
		FileReader fi2 = new FileReader(inputFile);
		int count2 = 0;
		while ((fi2.read()) != -1) {
			count2 += 1;
		}
		System.out.println(count2 + "字元");
		fi2.close();
		  
		
		BufferedReader br = new BufferedReader(new FileReader(new File("sample.txt")));
		String str;
		int count3 = 0;
		while ((str = br.readLine()) != null) {
			count3+=1;
		}
		System.out.println(count3 + "行");

	}

}
