package HW7;

import java.io.*;

public class HW7_3 {

	public static void main(String[] args) throws IOException {
		copyFile("Data.txt", "Datacopy.txt");
	}

	private static void copyFile(String input, String output) throws IOException {
		File inputFile = new File(input);
		File outputFile = new File(output);
		FileInputStream in = new FileInputStream(inputFile);
		BufferedInputStream fis = new BufferedInputStream(in);

		FileOutputStream out = new FileOutputStream(outputFile);
		BufferedOutputStream fos = new BufferedOutputStream(out);
		PrintStream ps = new PrintStream(fos);//方便的完成輸出的功能
		int c;

		while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
			out.write(c);
			System.out.print((char) c);//方便console觀測用
			System.out.flush();
		}

		in.close();
		out.close();

	}

}
