package Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
/**
 * 自定义RenterLock  支持重入
 * @author gubaidan
 *
 */
public class MyEnnterLock_23 implements Lock{
	
	private Helper helper = new Helper();
	
	private class Helper extends AbstractQueuedSynchronizer{
		@Override
		protected boolean tryAcquire(int arg) {
			// 如果第一个线程进来可以拿到锁 返回true
			
			//如果第二个线程进来拿不到锁  返回false
			
			int nowStatus = getState();
			
			if(nowStatus == 0) {
				if(compareAndSetState(0, arg)) {
					setExclusiveOwnerThread(Thread.currentThread());
					return true;
				}
			} else if(Thread.currentThread() == getExclusiveOwnerThread()) {
				setState(nowStatus + 1);
				return true;
			}
					
			return false;
		}
		
		@Override
		protected boolean tryRelease(int arg) {
			// 锁的获取和释放是一一对应的，那么调用此方法的一定是当前线程
			
			if(getExclusiveOwnerThread() != Thread.currentThread()) {
				throw new RuntimeException();
			}
			
			int status = getState() - arg;
			
			boolean flag = false;
			
			if(status == 0) {
				setExclusiveOwnerThread(null);
				flag = true;
			}
			
			setState(status);
			return flag;
		}
		
		protected Condition newCondition() {
			return new ConditionObject();
		}
	}

	@Override
	public void lock() {
		helper.acquire(1);
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		helper.acquireInterruptibly(1);
		
	}

	@Override
	public boolean tryLock() {
		return helper.tryAcquire(1);
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return helper.tryAcquireNanos(1, unit.toNanos(time));
	}

	@Override
	public void unlock() {
		helper.tryRelease(1);
		
	}

	@Override
	public Condition newCondition() {
		return newCondition();
	}

}
