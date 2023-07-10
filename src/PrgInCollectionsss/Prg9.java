package PrgInCollectionsss;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

//How to iterate the elements through HASHMAP;
public class Prg9 {
public static void main(String[] args) {
	int sum=0;
	Iterator iterator;
	HashMap<Integer, String> h1=new HashMap<>();
	h1.put(1, "sunil");
	h1.put(2, "Anil");
	h1.put(3, "kumar");
	h1.put(4, "kumar");
	h1.put(5, "mohan");
	h1.put(6, "saii");
//	System.out.println(h1.values());
//	System.out.println(h1.keySet());
	Collection c1=h1.values();
	Collection c2=h1.keySet();
	iterator=c1.iterator();
	System.out.println("the values from the HashSett are--->");
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	System.out.println("the keys from the HashSet are--->");
	iterator=c2.iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		//sum=sum+(Integer)iterator.next();
		
	}
	System.out.println("the sum of all the keypair is---> "+sum);
}
}
