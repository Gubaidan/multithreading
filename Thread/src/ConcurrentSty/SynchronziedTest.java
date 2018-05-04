package ConcurrentSty;

public class SynchronziedTest {

	public void method1() {
		System.out.println("Method1 start");
		try {
			synchronized (this) {
				System.out.println("method 1 eecute");
				Thread.sleep(3000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Method1 end");
	}

	public void method2() {
		System.out.println("Method2 start");
		try {
			synchronized (this) {
				System.out.println("method 2 eecute");
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Method2 end");
	}

	public static void NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			String temp = String.valueOf(i);

			while (temp.indexOf("1") != -1) {
				count++;
				temp = temp.substring(temp.indexOf('1') + 1, temp.length());
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		NumberOf1Between1AndN_Solution(1201);
		final SynchronziedTest test = new SynchronziedTest();
		new Thread(new Runnable() {

			@Override
			public void run() {
				test.method1();

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				test.method2();

			}
		}).start();

	}

}
