package Volatile;

/**
 * 保证内存可见性的前提是拿到同一把锁
 * 
 * @author gubaidan
 *
 */
public class Volatile_18 {

	private volatile int a = 1;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Volatile_18 volatile_18 = new Volatile_18();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(volatile_18.getA());
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				volatile_18.setA(2);
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(volatile_18.getA());
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(volatile_18.getA());
			}
		}).start();

	}

}
