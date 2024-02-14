package new_programs;

public class Prog_8_Reverse_a_word {
	public static void main(String[] args) {
		String s = "hello world";
		String s1="";
		String s2[]= s.split(" ");
		for(int i=0;i<=s2.length-1;i++) {
			for(int j=s2[i].length()-1;j>=0;j--) {
				s1=s1+s2[i].charAt(j);
			}
		}
		System.out.println("\"hey\""+s1);
	}
}
/* Output:-
 ollehdlrow
 */
