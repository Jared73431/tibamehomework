package HW9;

public class HW9_1 implements Runnable {
	/*
	 * 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
	 * 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
	 * Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
	 * 參考範例：CounterRunnable.java
	 * 需留意主執行緒執行順序*/

	int counter = 1; 
	String name;
	public HW9_1(){
		
	}
	
	public void run() {
		
		while(counter <= 10) {
			System.out.println(name +"吃第"+ counter +"碗飯");
			counter++;
			try {
				int stop = (int)(Math.random()*(3000-500))+500;
				Thread.sleep(stop);
			}
			catch(Exception e) {}
		}
		System.out.println(name + "吃完了");
	}
	
	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始！-----");
		HW9_1 james = new HW9_1();
		james.name = "詹姆士";
		Thread jamesy = new Thread(james);
		HW9_1 bread = new HW9_1();
		bread.name = "饅頭人";
		Thread bready = new Thread(bread);
		jamesy.start();
		bready.start();
		try {
			jamesy.join();
			bready.join();

		}
		catch(Exception e) {}
		System.out.println("-----大胃王快食比賽結束！-----");
	}

}
