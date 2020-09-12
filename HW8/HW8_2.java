package HW8;

import java.util.*;

class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public int getNumber() {
		return number;
	}

	public void setNumber() {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType() {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart() {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest() {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice() {
		this.price = price;
	}

	public Train() {
		super();
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int compareTo(Train aTrain) {
		// 物件本身與 aTrain 相比較，如果 retrun 正值，就表示比 aTrain 大
		if (this.number > aTrain.number) {
			return -1; // right右邊
		} else if (this.number == aTrain.number) {
			return 0; // 不變
		} else {
			return 1; // Left左邊
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + number;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (number != other.number)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public void show() {
		System.out.println(this.number + "," + this.type + "," + this.start + "," + this.dest + "," + this.price);
	}

}

public class HW8_2 {
	public static void main(String[] args) {

		Set<Train> set = new TreeSet<Train>();
		// 使用TreeSet需實作Comparable介面才能比大小排序
		// 判斷是否重複需要覆寫equals和hashcode方法

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		// 使用for
		for (Train s : set) {
			System.out.println(s.getNumber() + "," + s.getType() + "," + s.getStart() + "," + s.getDest() + s.getPrice());
		}

		System.out.println("===============================");

		// 使用Iterator
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Train obj = (Train) it.next();
			obj.show();
		}

		System.out.println("===============================");

		LinkedList<Train> list = new LinkedList();
		for (Train s : set) {
			list.add(s);
		}

		list.addLast(new Train(116, "自強", "高雄", "台北", 500));

		for (Train s : list) {
			s.show();
		}

	}
}