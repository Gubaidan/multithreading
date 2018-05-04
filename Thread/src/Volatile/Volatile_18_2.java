package Volatile;



public class Volatile_18_2 {
	private volatile boolean run = false;

	public static void main(String[] args) {
		Volatile_18_2 volatile_18_2 = new Volatile_18_2();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName()+"第 " + i + "次执行");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				volatile_18_2.run = true;
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(!volatile_18_2.run) {

				}
				System.out.println(Thread.currentThread().getName()+ "执行了");
			}
		}).start();
		

	}

}