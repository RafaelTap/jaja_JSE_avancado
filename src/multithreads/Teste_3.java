package multithreads;

public class Teste_3 {
	
	public static void main(String[] args) {
		
		ExemploThread_3 et3 = new ExemploThread_3();
		Thread t = new Thread(et3, "thread_pessoal");
		
		t.start();
		
		String name = Thread.currentThread().getName();
		
		System.out.println("Nome da thread principal: " + name);
		
	}

}
