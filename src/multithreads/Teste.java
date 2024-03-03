package multithreads;

public class Teste {

	public static void main(String[] args) {

		ExemploThread et = new ExemploThread();
		et.start(); // usado parae executar threads.

		try {

			for (int i = 0; i < 20; i++) {
				System.out.print("J ");
				Thread.sleep(200); // não garante uniformidade na impressão.
			}

		} catch (Exception e) {

		}
	}

	// temos dois conteúdos em execução, o código do metodo main e o 
	// método da classe ExemploThread.
}
