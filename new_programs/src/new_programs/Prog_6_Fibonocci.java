package new_programs;

public class Prog_6_Fibonocci {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0;
		while (n1 <= 100) {
			System.out.print(" " + n1);
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}
}
