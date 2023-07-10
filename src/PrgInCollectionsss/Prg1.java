package PrgInCollectionsss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Program to convert ARRAY into Collection
public class Prg1 {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the values");
	int n=Integer.parseInt(bufferedReader.readLine());
	System.out.println(n);
	String[] name=new String[n];
	for(int i=0;i<name.length;i++){
		name[i]=bufferedReader.readLine();
	}
	List<String> l1=Arrays.asList(name);
	System.out.println();
	
	for(String x:l1){
		System.out.print(x+",");
	}
}
}	
//	
//	int[] arr={1,2,3,4,5,6,7};
//	List<int[]> m=Arrays.asList(arr);
//	for(int[] i:m){
//		System.out.println(i);
//	}
//}
//
//@Override
//public String toString() {
//	return "Prg1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
//}

