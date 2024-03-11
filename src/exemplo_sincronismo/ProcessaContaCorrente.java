package exemplo_sincronismo;

public class ProcessaContaCorrente implements Runnable {

	ContaCorrente conta = new ContaCorrente();

	private synchronized void efetuarOperacao(double valor) { // synchronized (para sincronizar as threads).
		String nome = Thread.currentThread().getName();

		try {
			if (conta.verificarSaldo(valor)) {
				System.out.println("valor sacado por " + nome + ": " + valor);
				System.out.println("saldo para " + nome + ": " + conta.efetuarSaque(valor));

			} else {
				System.out.println("Saldo insuficiente para " + nome);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(100);
				efetuarOperacao(20);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
