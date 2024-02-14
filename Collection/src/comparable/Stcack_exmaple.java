package comparable;

import java.util.Stack;

public class Stcack_exmaple {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		for(Integer i:s) {
			System.out.println(i);
		}
		System.out.println("--------");
		s.pop();//30 will be removed
		s.pop();//20 will be removed
		System.out.println(s);
		
		//Output:-
//		10
//		20
//		30
//		--------
//		[10]
	}
}
