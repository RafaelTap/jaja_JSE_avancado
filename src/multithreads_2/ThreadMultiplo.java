package multithreads_2;

public class ThreadMultiplo implements Runnable {

	@Override
	public void run() {
		try {
			String name = Thread.currentThread().getName();
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread: " + name + "posição: " + i);
				Thread.sleep(200);
			}

		} catch (Exception e) {

		}

	}

}
