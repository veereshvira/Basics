package collection;

public class TryCatchExample11 {
	public static void main(String[] args) {
		try {
			int i[] = new int[4];
			i[4] = 30 / 0;

		} catch (NullPointerException e1) {
			System.out.println("NullPointerException occurs");
		}

		catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("NullPointerException occurs");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurs");
		} catch (Exception e) {
			System.out.println("Exception occurs");
		}
	}
}
