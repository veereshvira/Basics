package dmeo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class DD {
	
	
	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(39);
		s.add(12);
		s.add(33);
		s.add(44);
		s.add(89);
		List l = new ArrayList(s);
		System.out.println("Before sorting");
		System.out.println(s);
		l.addAll(s);
		System.out.println("After sorting");
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.get(2));
		System.out.println(l.get(7));
		List l1 = new LinkedList();
		l1.add(l);
		Collections.sort(l1);
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(0);
		for(int i:q) {
			System.out.println(i);
		}
		System.out.println(q);
//		q.clear();
		System.out.println(q.isEmpty());
		System.out.println(q);
		System.out.println(q.remove(q));
	}
}
