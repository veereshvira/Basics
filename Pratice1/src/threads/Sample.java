package threads;

public class Sample extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("i:" + i);
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Sample1 extends Thread {
	public void run() {
		for (int j = 6; j <= 10; j++) {
			System.out.println("j:" + j);
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
