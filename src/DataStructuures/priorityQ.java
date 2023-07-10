package DataStructuures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class priorityQ {
public static void main(String[] args) {
	PriorityQueue<Integer> l1=new PriorityQueue<Integer>();
	l1.add(1);
	l1.add(3);
	l1.add(24);
	l1.add(11);
	l1.add(17);
//	System.out.println(l1);
//	System.out.println(l1.peek());
//	System.out.println(l1);
//	System.out.println(l1.poll());
//	System.out.println(l1);
	LinkedList<Integer> m=new LinkedList<Integer>(l1);
	System.out.println(l1);
//	ArrayList<Integer> l2=new ArrayList<Integer>(l1);
//	System.out.println(l2);
//	for (int i = 0; i < l1.size(); i++) {
//		if(i==3)
//		System.out.println(l2.get(i));
//	}
	
}
}
