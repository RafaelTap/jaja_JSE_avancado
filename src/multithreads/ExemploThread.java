package multithreads;

public class ExemploThread extends Thread {
// método run não é obrigatório implementar por já está implementando runnable
	public void run() {

		try {
			for (int i = 0; i < 20; i++) {
				System.out.print("y");
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void run(String texto) {

	}

	/*
	 * o método run é sempre chamado pela jvm, quando sobrecarregado a jvm sempre
	 * olha primeiro para o método run.
	 */
}
