package Programming;

public class ReverseAwords {
	public static void main(String[] args) {
		String s ="hello hey eye";
		String s1[] = s.split(" ");

		for(String ss:s1) {
			String s2=" ";
			for(int i=ss.length()-1;i>=0;i--) {
				s2=s2+ss.charAt(i);
			}
			System.out.print(s2);
//			if(ss.equals(s2)) {
//				System.out.println("same");
//			}
//			else
//			{
//				System.out.println("not same");
//			}
		}
	}
}
