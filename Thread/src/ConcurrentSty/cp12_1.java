package ConcurrentSty;

public class cp12_1 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Target());t1.setPriority(10);
		Thread t2 = new Thread(new Target());t2.setPriority(7);
		Thread t3 = new Thread(new Target());t3.setPriority(1);
		Thread t4 = new Thread(new Target());t4.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}


 