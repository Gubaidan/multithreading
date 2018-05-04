package ConcurrentSty;

public class cp_13_1_Sequence {
	private int value;

	public synchronized int getNext() {
		return value++;
	}

	public static void main(String[] args) {
		cp_13_1_Sequence cp_13_1_Sequence = new cp_13_1_Sequence();
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
