package easyp;

public class Trainer {
synchronized void askQuestion(String name) {
	System.out.println(name+"asking a question ");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(name+"got a answer\n---");
}
}
