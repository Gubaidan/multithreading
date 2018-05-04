package ConcurrentSty;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 定时器
 * @author gubaidan
 *
 */
public class cp_8_1 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			int count = 1;
			
			@Override
			public void run() {
				System.out.println("第 "+ count + " 次执行。");
				count++;
			}
		}, 0, 1000);
	}

}
