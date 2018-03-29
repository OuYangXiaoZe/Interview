
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test1 {
	static Lock lock = new ReentrantLock();
	static Condition condition = lock.newCondition();
	static boolean flag = true;

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					lock.lock();
					try {
						if (!flag)
							condition.await();
						for (int j = 0; j < 5; j++) {
							System.out.println(i + " sub thread " + j);
						}
						flag = false;
						condition.signal();
					} catch (Exception e) {
					} finally {
						lock.unlock();
					}
				}

			}
		}).start();

		for (int i = 0; i < 50; i++) {
			lock.lock();
			try {
				if (flag)
					condition.await();
				for (int j = 0; j < 10; j++) {
					System.out.println(i + " main thread " + j);
				}
				flag = true;
				condition.signal();
			} catch (Exception e) {
			} finally {
				lock.unlock();
			}
		}
	}
}
