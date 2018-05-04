package Lock;

public class Sequence_Mylock {
	private MyLock_21_1 lock  = new MyLock_21_1();
	
	private int value = 0;
	
	public int getNext() {
		lock.lock();
		int i = value ++;
		lock.unlock();
		return i;
	}
	
	public static void main(String[] args) {
		Sequence_Mylock cp_13_1_Sequence = new Sequence_Mylock();
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
