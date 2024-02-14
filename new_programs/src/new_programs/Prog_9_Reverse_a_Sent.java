package new_programs;

public class Prog_9_Reverse_a_Sent {
	public static void main(String[] args) {
		String s="hello world";
		String s1="";
		String[] s2=s.split(" ");
		for(int i=s2.length-1;i>=0;i--) {
			s1=s1+s2[i]+" ";
		}
		System.out.println(s1);
	}
}

/* Output- 
world hello
 */