package ReadLock;

public class TestReadWriteLock {

	public static void main(String[] args) {
		ReadWriteLock_25 readWriteLock = new ReadWriteLock_25(); 
		readWriteLock.put("1", 10);
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				readWriteLock.put("2", 20);
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				readWriteLock.put("3", 40);
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				readWriteLock.put("4", 50);
			}
		}).start();
		

	}

}
