package Sample11;

public class P3 {
	public static void main(String[] args) {
		int a = 10;
		for (int i = 10; i <= 90; i += 10) {
			for (int j = 10; j <= 90; j += 10) {
//				if (a % 10 == 0)
					System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
	}
}
