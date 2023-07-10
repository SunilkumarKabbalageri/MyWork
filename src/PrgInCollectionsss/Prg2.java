package PrgInCollectionsss;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

//How to compare a Elements in a collection
public class Prg2 {
public static void main(String[] args) {
	String[] name={"Penny", "nickel", "dime", "Quarter", "dollar" };
	Set set=new TreeSet();
	
	for(int i=0;i<name.length;i++){
		set.add(name[i]);
	}
	for(Object s1:set){
		System.out.println(s1);
	}
	
	System.out.println("-*-*--*-*-*-*-*-*-*");
	
	System.out.println("The minimum element in the set is-->  "+Collections.min(set));
	System.out.println("the maximum element in the set is---> "+Collections.max(set));
	System.out.println("it will consider the small element in the set with small letter that is---> "+Collections.min(set,String.CASE_INSENSITIVE_ORDER));
	System.out.println("It will conisder the biggest element of the Capital letter word and that is---> "+Collections.max(set,String.CASE_INSENSITIVE_ORDER));
	
}
}
