package PrgInCollectionsss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//CONVERT LIST INTO AN ARRAY
public class Prg3 {
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add("Hie");
	l1.add("My");
	l1.add("Name");
	l1.add("is");
	l1.add("Sunil");
	System.out.println("Collection objects");
	System.out.println(l1);
	String[] arr=new String[l1.size()];
	for(int i=0;i<arr.length;i++){
		arr[i]=l1.get(i);
	}
	System.out.println("\n-*-*-*-*-*-*-*\n");
	System.out.println("Converted into ArrayElements");
	System.out.println(Arrays.toString(arr));
	
	
}
}
