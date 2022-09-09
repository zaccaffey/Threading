package threads;

public class College {
	
	public static void main(String[] args) {
		FeeCounterThread fct = new FeeCounterThread();
		Thread lt = new Thread(new LibraryThread());
		
		fct.start();
		lt.start();
	}

}
