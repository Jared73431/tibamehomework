package HW7;

import java.io.*;

public class HW7_4 {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Data");
		if (!file.exists()) {
			file.mkdir();
		}
		Object[] objs = new Object[4];
		
		objs[0] = new Dog("阿狗");
		objs[1] = new Cat("阿貓");
		objs[2] = new Dog("哈士奇");
		objs[3] = new Cat("虎斑");
		// 輸出
		ObjectOutputStream objout = new ObjectOutputStream(new FileOutputStream(new File("C:\\data\\Object.dat")));
		for(int i = 0 ; i<objs.length ; i++) {
			objout.writeObject(objs[i]);
		}
		objout.close();
		//輸入
		ObjectInputStream objint = new ObjectInputStream(new FileInputStream(new File("C:\\data\\Object.dat")));
		try {
			while(true) {
				((ISpeak)objint.readObject()).speak();
			}
			
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
		objint.close();
	}

}
