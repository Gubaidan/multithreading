package Singlton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleTonThread {

	public static void main(String[] args) {
		
		ExecutorService threadPool = Executors.newFixedThreadPool(20);
		for(int i = 0; i < 20 ; i++) {
			threadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					LazzyModel hs = LazzyModel.getInstance();
					System.out.println(Thread.currentThread().getName()+ " "+hs.hashCode());
				}
			});
		}
		threadPool.shutdown();
	}

}
