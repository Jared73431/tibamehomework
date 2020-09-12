package HW4;

public class HE4_3 {

	public static void main(String[] args) {
		// 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String[] plant = {"mercury", "venus", "earth", "mars", 
				"jupiter", "saturn", "uranus", "neptune"};
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		for(int i=0;i<plant.length;i++) {
			for(int j= 0;j<plant[i].length();j++) {
				char lett = plant[i].charAt(j);
				switch (lett) {
				case'a':
					counta+=1;
					break;
				case'e':
					counte+=1;
					break;
				case'i':
					counti+=1;
					break;
				case'o':
					counto+=1;
					break;
				case'u':
					countu+=1;
					break;
				}
			}
		}
		int sum1 =counta+counte+counti+counto+countu;
		System.out.println("a有"+counta+"個");
		System.out.println("e有"+counte+"個");
		System.out.println("i有"+counti+"個");
		System.out.println("o有"+counto+"個");
		System.out.println("u有"+countu+"個");
		

	}

}
