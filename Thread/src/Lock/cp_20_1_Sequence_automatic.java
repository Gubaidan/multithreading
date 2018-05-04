package Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class cp_20_1_Sequence_automatic {
	Lock look = new ReentrantLock();
	private int value = 0;

	public int getNext() {
		look.lock();
		int a = value++;
		look.unlock();
		return a;
	}

	public static void main(String[] args) {
		cp_20_1_Sequence_automatic cp_13_1_Sequence = new cp_20_1_Sequence_automatic();
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " " + cp_13_1_Sequence.getNext());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " " + cp_13_1_Sequence.getNext());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " " + cp_13_1_Sequence.getNext());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
