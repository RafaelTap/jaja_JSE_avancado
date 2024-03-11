package exemplo_sincronismo;

public class TesteContaCorrente {

	public static void main(String[] args) {

		ProcessaContaCorrente cc = new ProcessaContaCorrente();

		Thread t1 = new Thread(cc, "joão");
		Thread t2 = new Thread(cc, "Julia");

		try {
			t1.start();
			t2.start();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
