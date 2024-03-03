package multithreads;

public class ExemploThread_3 implements Runnable {

	@Override
	public void run() {
		String nome = Thread.currentThread().getName();
		System.out.println("nome: " + nome);

	}

	// definindo um nome para a thread, pelo setNome() ou pelo construtor da classe
}
