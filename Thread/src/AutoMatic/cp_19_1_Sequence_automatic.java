package AutoMatic;

import java.util.concurrent.atomic.AtomicInteger;

public class cp_19_1_Sequence_automatic {
	private AtomicInteger value = new AtomicInteger(0);

	public int getNext() {
		return value.getAndIncrement();
	}

	public static void main(String[] args) {
		cp_19_1_Sequence_automatic cp_13_1_Sequence = new cp_19_1_Sequence_automatic();
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
