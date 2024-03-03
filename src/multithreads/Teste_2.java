package multithreads;

public class Teste_2 {

	public static void main(String[] args) {

		ExemploThread_2 et2 = new ExemploThread_2(); // objeto runnable, passado como parametro na classe thread.
		Thread t = new Thread(et2);

		t.start();

		try {

			for (int i = 0; i < 20; i++) {
				System.out.print("J ");
				Thread.sleep(200); // não garante uniformidade na impressão.
			}

		} catch (Exception e) {

		}
	}

}
