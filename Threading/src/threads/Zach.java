package threads;

public class Zach extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		for(int i=0; i<3; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("zach starting for lunch");
	}

}
