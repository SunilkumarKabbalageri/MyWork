package PrgInCollectionsss;
//remove all the duplicate elements from the multiple Strings..
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class prg6 {
public static void main(String[] args) {
	//insert the elements in the 1st array
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sizeof an 1st array");
	int size1=sc.nextInt();
	System.out.println("Enter the elements into an array");
	String[] arr1=new String[size1];
	for(int i=0;i<arr1.length;i++){
		arr1[i]=sc.next();
	}
	//insert the elements in the 2nd array
	System.out.println(arr1.length);
	System.out.println(Arrays.toString(arr1));
	System.out.println("Enter the size of second array");
	int size2=sc.nextInt();
	System.out.println("Enter the elements into 2nd array");
	String[] brr2=new String[size2];
	for(int i=0;i<brr2.length;i++){
		brr2[i]=sc.next();
	}
	System.out.println(brr2.length);
	
	//add two arrays.
	int x=0;
	String[] crr=new String[size1+size2];
	System.out.println(crr.length);
	for(int i=0;i<crr.length;i++){
		if(i<arr1.length){
			crr[i]=arr1[i];
		}
		else{
			crr[i]=brr2[x];
			x++;
		}
	}
	System.out.println(Arrays.toString(crr));
	LinkedHashSet<String> h1=new LinkedHashSet<String>();
	for(int i=0;i<crr.length;i++){
		h1.add(crr[i]);
	}
	//final output with unique elements
	System.out.println(h1);
	
}
}
