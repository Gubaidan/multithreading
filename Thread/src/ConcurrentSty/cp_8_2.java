package ConcurrentSty;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池 
 * @author gubaidan
 *
 */
public class cp_8_2 {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newScheduledThreadPool(10);
		for(int i = 0; i < 10; i++){
			threadPool.execute(new Runnable() {
				
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		threadPool.shutdown();
		
	}

}
