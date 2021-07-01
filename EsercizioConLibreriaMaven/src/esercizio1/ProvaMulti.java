package esercizio1;

public class ProvaMulti {

	public static void main(String[] args) throws InterruptedException {
		 Runnable primo = new Asterisco();
		 Runnable secondo = new Cancelletto();
		 Thread t1 = new Thread(primo);
		 Thread t2 = new Thread(secondo);
		 
		
		 t1.start();
		 t2.start();
		 

	}

}
