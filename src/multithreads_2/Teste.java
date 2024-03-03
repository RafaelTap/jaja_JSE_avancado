package multithreads_2;

public class Teste {

	public static void main(String[] args) {

		ThreadMultiplo th = new ThreadMultiplo();

		Thread t1 = new Thread(th, "João ");
		Thread t2 = new Thread(th, "Maria ");

		t1.start();
		t2.start();
		
		

	}

}
