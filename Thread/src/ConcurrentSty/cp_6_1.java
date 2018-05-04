package ConcurrentSty;

public class cp_6_1 extends Thread{

	public cp_6_1(String string) {
		super(string);
	}

	public static void main(String[] args) throws InterruptedException {
		cp_6_1 cp_6_1 = new cp_6_1("线程1");
		cp_6_1.start();
		cp_6_1 cp_6_2 = new cp_6_1("线程2");
		cp_6_2.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+"正在执行");
				
			}
		}).run();
	} 

	@Override
	public void run() {
			System.out.println(this.getName()+"正在执行：");
	}

}
