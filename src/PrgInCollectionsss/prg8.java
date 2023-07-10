package PrgInCollectionsss;

import java.util.HashSet;
import java.util.Iterator;

//how to remove specific element from the colection;
public class prg8 {
public static void main(String[] args) {
	System.out.println("Enter the collection examples");
	Iterator iterator;
	int size;
	HashSet<String> m1=new HashSet<String>();
	String str1="Green", str2="Yellow", str3="Blue" ,str4="Orange", str5="White", str6="Blue";
	m1.add(str1);
	m1.add(str2);
	m1.add(str3);
	m1.add(str4);
	m1.add(str5);
	m1.add(str6);
	
	System.out.println("collection data:");
	System.out.println("BEFORE REMOVING THE VALUES :");
	iterator=m1.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next()+" ");
	}
	size=m1.size();
	System.out.println("size before removing---> "+size+"\n");
	m1.remove(str5);
	iterator=m1.iterator();
	System.out.println("AFTER REMOVINNG THE VALUES :");
	while(iterator.hasNext()){
		System.out.println(iterator.next()+" ");
	}
	 size=m1.size();
	System.out.println("the size after removing the elements is--> "+size);
}
}
