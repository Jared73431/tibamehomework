package HW5;

public class HW5_2 {

	public static void main(String[] args) {
		randAvg();

	}

	static void randAvg() {
		int[] pool = new int[10];//要顯示的結果
		for (int i = 0; i < pool.length; i++) {
			pool[i] = (int) (Math.random() * 101);
		}
		int sum = 0;
		for (int j = 0; j < pool.length; j++) {
			sum += pool[j];
		}
		int avg = sum / 10;
		System.out.print("本次亂數結果:");
		for (int c = 0; c < pool.length; c++) {
			System.out.print(pool[c] + " ");
		}
		System.out.println("平均值:" + avg);
	}

}
