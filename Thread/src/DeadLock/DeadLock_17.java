package DeadLock;

public class DeadLock_17 {

	private Object o1 = new Object();
	private Object o2 = new Object();

	private void a() {
		synchronized (o1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (o2) {
				System.out.println("a()");
			}

		}
	}

	private void b(){
		synchronized (o2) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (o1) {
				System.out.println("b()");
			}

		}
	}

	public static void main(String[] args) {
		DeadLock_17 d = new DeadLock_17();
		new Thread(new Runnable() {

			@Override
			public void run() {
				d.a();
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				d.b();
			}
		}).start();

	}

}
