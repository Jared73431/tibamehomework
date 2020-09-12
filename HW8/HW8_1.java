package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;

public class HW8_1 {

	public static void main(String[] args) {
		ArrayList arrl = new ArrayList();
		arrl.add(new Integer(100));
		arrl.add(new Double(3.14));
		arrl.add(new Long(21L));
		arrl.add(new Short("100"));
		arrl.add(new Double(5.1));
		arrl.add("Kitty");
		arrl.add(new Integer(100));
		arrl.add(new Object());
		arrl.add("Snoopy");
		arrl.add(new BigInteger("1000"));
		Iterator st = arrl.iterator();
		//iterator 迭代器
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		System.out.println("-------------------");
		//傳統for迴圈
		for(int i = 0 ; i<arrl.size() ; i++) {
			Object obj = arrl.get(i);
			System.out.println(obj);
		}
		System.out.println("-------------------");
		//增強for迴圈
		for(Object obj : arrl) {
			System.out.println(obj);
		}
		System.out.println("-------------------");

		for(int i=0; i<arrl.size(); i++) {
			Object obj = arrl.get(i);
			if(!(obj instanceof Number)) {
				arrl.remove(i);
				i--;
			}
		}
		
		for(Object obj : arrl) {
			System.out.println(obj);
		}

	}

}
