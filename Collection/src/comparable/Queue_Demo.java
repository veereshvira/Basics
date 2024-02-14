package comparable;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(10);
		q.add(40);
		q.add(20);
		q.add(30);
		System.out.println(q);
		System.out.println("============");
		System.out.println(q.element());
		System.out.println(q.peek());
//		System.out.println(q.remove());//Removes 1st element from the object-i.e-10;
		System.out.println("============");
		for(Integer i :q) {
			System.out.println(i);
		}
		System.out.println("-----------");
		q.poll();
		for(Integer i :q) {
			System.out.println(i);
		}
		System.out.println(q.isEmpty()); 
		q.clear();
		System.out.println(q.isEmpty());
	}
}
