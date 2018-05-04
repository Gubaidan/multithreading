package ConcurrentSty;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * 线程回调
 * @author gubaidan
 *
 */
public class cp_07_1 implements Callable<Integer>{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		cp_07_1 cp_07_1 = new cp_07_1();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(cp_07_1);
		Thread thread = new Thread(futureTask);
		thread.start();
		System.out.println(futureTask.get());

	}

	@Override
	public Integer call() throws Exception {
		System.out.println("jisuan");
		Thread.sleep(2000);
		return 1;
	}

}
 