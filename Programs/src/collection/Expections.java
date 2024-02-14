package collection;

public class Expections {
	public static void main(String[] args) {
		/*try {
			String s = null;
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Please Debug and try again");
		} finally {
			System.out.println("Finally block is executing even if error occurs");
		}*/
		int i=50;
		int j=0;
		int data;
		try {
			data=i/j;
		} catch (Exception e) {
			e.printStackTrace();
			//Resolving the error in the catch block
			System.out.println(i/(j+2));
		}
		
	}
}
