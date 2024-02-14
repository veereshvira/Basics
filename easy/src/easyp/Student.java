package easyp;

public class Student extends Thread {
	String name;
	Trainer trainer;
	Student(String name, Trainer trainer) {
		this.name = name;
		this.trainer = trainer;
	}
	@Override
	public void run() {
		trainer.askQuestion(name);
	}
}
