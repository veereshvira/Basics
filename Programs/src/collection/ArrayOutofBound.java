package collection;

public class ArrayOutofBound {
	public static void main(String[] args) {
		try {
			int i[] = {2,3,1};
			System.out.println(i[10]);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
