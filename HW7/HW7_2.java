package HW7;

import java.io.*;
import java.util.*;

public class HW7_2 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("Data.txt", true);

			bw = new BufferedWriter(fw);

			pw = new PrintWriter(bw);
			Set set = new HashSet();
			while(set.size()!=10) {//保證有六個元素
				int r = (int)(Math.random()*1000)+1;
				set.add(r);
			}
			Iterator objs = set.iterator();
			while (objs.hasNext()) {
				pw.print(objs.next()+" ");
			}
			pw.println("");
			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {
			System.err.println(e);

		}

	}

}
