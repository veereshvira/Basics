package threads;

public class Demo extends Thread {
	public void run() {

		for (int i = 0; i <= 100; i++) {
			System.out.println("i" + i);
		}
		try {
			Thread.sleep(1000);
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

class Demo2 extends Thread {
	public void run() {
		for (int j = 101; j <= 200; j++) {
			System.out.println("j" + j);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
