package Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.omg.CORBA.Current;

public class MyLock_21_1 implements Lock {
	
	private boolean isLocked = false;
	private Thread isLock = null;
	private int countThread = 0;
	

	@Override
	public synchronized void lock() {
		Thread current = Thread.currentThread();
		while (isLocked && current != isLock) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		isLocked = true;
		isLock = current;
		countThread ++;
	}
	
	@Override
	public synchronized void unlock() {
		if(isLock == Thread.currentThread()) {	
			countThread --;
			if(countThread == 0) {
				notifyAll();
				isLocked = false;
				isLock = null;
			}
			
		}
		
		
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean tryLock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

}
