package new_programs;

public class Prog_7_Reverse_a_Sentence {
	public static void main(String[] args) {
		String s ="Hello heh";
		String ss = s.toLowerCase();
		String s1[]=s.split(" ");
		for(String ss1 : s1) {
			String s2=" ";
			for(int i=ss.length()-1;i>=0;i--) {
				s2=s2+ss.charAt(i);
//				System.out.print(ss.charAt(i));
			}
			System.out.print(s2);

		}
	}
}
