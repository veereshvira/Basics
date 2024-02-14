package collection;

import java.io.PrintWriter;

public class TryCatchExample10 {
	public static void main(String[] args) {
		System.out.println("Started");
		PrintWriter pw;
		try {
			pw = new PrintWriter("qsdnptg.txt");
			pw.println("Saved");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File saved Successfully");
		}
	}
}
