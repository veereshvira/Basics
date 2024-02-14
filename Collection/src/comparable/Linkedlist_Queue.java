package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist_Queue {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(30);
//		System.out.println(al);
		LinkedList ll = new LinkedList();
		ll.addAll(al);
//		for(Integer i :ll) {
//			System.out.println(ll);
//		}
		System.out.println(ll);
		Collections.sort(ll);
		for(Object o:ll) {
			System.out.println(o);
		}
	}
}
