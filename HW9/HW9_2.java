package HW9;

class BankCount{
	private int save = 0;
	synchronized public void deposit(int cashin) {
		if(save > 2000) {
			System.out.println("熊媽看到餘額在2000以上，暫停匯款");
			try {
				System.out.println("熊大被熊媽告知帳戶已經有錢!");
				wait(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(save <= 2000) {
			save += cashin;
			System.out.println("熊媽存了2000，帳戶共有：" + save);
			notify();
		}
	}
	
	synchronized public void draw(int cashout) {
		if(save < cashout ) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				System.out.println("熊媽被熊大要求匯款！");
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		save -= cashout;
		System.out.println("熊大領了"+ cashout + "，帳戶共有：" + save);
		notify();
		if(save < cashout) {
			System.out.println("熊大看到餘額在"+ cashout + "以下，要求匯款");
		}
	}
}	
	
class Bearmon extends Thread{
	BankCount monGive;
	
	public Bearmon(BankCount monGive) {
		this.monGive = monGive;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			monGive.deposit(2000);
		}
	}
}	
	
class Bear extends Thread{
	BankCount bearDraw;
	
	public Bear(BankCount bearDraw) {
		this.bearDraw = bearDraw;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bearDraw.draw(1000);
			
		}
	}
}	
	
public class HW9_2 {
	public static void main(String[] args) {
		BankCount bankcount = new BankCount();
		Bearmon bearmon = new Bearmon(bankcount);
		Bear bear = new Bear(bankcount);
		bearmon.start();	
		bear.start();
	}

}
