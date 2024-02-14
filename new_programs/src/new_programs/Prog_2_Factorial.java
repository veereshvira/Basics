package new_programs;

public class Prog_2_Factorial {
static int fact(int n) {
	if(n>=1) {
		return n*fact(n-1);
	}
	else {
		return 1;
	}
}
public static void main(String[] args) {
	System.out.println(fact(3));
}
}
