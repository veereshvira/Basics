package threadsafe;

public class Employee extends Thread{
	@Override
	public void run() {
		for(int j=6;j<=10;j++) {
			System.out.println("j:"+j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
