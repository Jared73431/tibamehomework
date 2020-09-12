package HW7;

import java.io.Serializable;

public class Cat implements Serializable,ISpeak{//序列化,介面
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

}
