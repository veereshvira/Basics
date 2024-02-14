package threadsafe;

public class Train extends Thread {
	@Override
	public void run() {
		System.out.println(" Travelling");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
