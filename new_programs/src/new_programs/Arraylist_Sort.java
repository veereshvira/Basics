package new_programs;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Sort {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(12);
		al.add(8);
		al.add(9);
		al.add(3);
		Collections.sort(al);
		for(int s :al) {
			System.out.print(" "+s);
		}
	}
}
