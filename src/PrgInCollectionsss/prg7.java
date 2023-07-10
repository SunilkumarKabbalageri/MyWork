package PrgInCollectionsss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class prg7 {
	public static void main(String[] args) {
		char[] arr={'A','B','C','D','E'};
		Iterator iterator;
		List l1=new ArrayList();
		for(int i=0;i<arr.length;i++){
			l1.add(arr[i]);
		}
		iterator=l1.iterator();
		System.out.println("Before-->");
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}	
		Collections.reverse(l1);
		System.out.println("After--->");
		iterator=l1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next()+" ");
		}
		
	}
	
	
}

