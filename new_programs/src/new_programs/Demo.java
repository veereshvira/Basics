package new_programs;

public class Demo {
	public static void main(String[] args) {
		String s = "i love india";
		String s1 = "";
		String s2[]=s.split(" ");
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);
	}
}
