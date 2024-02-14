package Programming;

public class RevString {
	public static void main(String[] args) {
		String s="HelloHello";
//		int a=0,sc=0,n=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a')&&(c>='z')||(c>='A')&&(c<='Z')) {
				System.out.println(c);
			}
		}
	}
}

