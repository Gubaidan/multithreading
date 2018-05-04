package Lock;

public class Sequence_MyEnnterLock {
	private MyEnnterLock_23 lock = new MyEnnterLock_23();
	private int value = 0;
	
	public int getNext() {
		int i = 0;
		lock.lock();
		i = value ++;
		lock.unlock();
		return i;
	}
	
	public static void main(String[] args) {
		Sequence_MyEnnterLock cp_13_1_Sequence = new Sequence_MyEnnterLock();
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
