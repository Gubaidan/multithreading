package ReadLock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * @author gubaidan
 *
 */

public class ReadWriteLock_25 {
	
	private Map<String,Object> map = new HashMap<>();
	
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	private Lock read = readWriteLock.readLock();
	
	private Lock write = readWriteLock.writeLock();
	
	public Object get(String key) {
		read.lock();
		System.out.println(Thread.currentThread().getName() + " 读");
		try {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return map.get(key);
		} finally {
			read.unlock();
		}
		
	}
	
	public void put(String key, Object value) {
		write.lock();
		System.out.println(Thread.currentThread().getName() + " 写");
		try {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(key, value);
		} finally {
			write.unlock();
		}
		
	}

}
