package Lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenterTest_21 {
	static MyLock_21_1 lock = new MyLock_21_1();
	
	public static void a() {
		lock.lock();
		System.out.println("a");
		b();
		lock.unlock();
	}
	public static void b() {
		lock.lock();
		System.out.println("b");
		lock.unlock();
	}

	public static void main(String[] args) {
		ReenterTest_21 reenterTest_21  = new ReenterTest_21();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				reenterTest_21.a();		
			}
		}).start();

	}

}
