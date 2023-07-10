package com.jsp.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class inner1 {
public static void printArray(int[] arr){
	System.out.println("the sorted array is--> "+Arrays.toString(arr));
}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt();
	System.out.println("Enter the values");
	int[] brr=new int[size];
	for (int i = 0; i < brr.length; i++) {
		brr[i]=sc.nextInt();
	}
	System.out.println();
	System.out.println("Unsorted array is---> "+Arrays.toString(brr));
	
	//Insertion sort:
	
	for (int i = 0; i < brr.length; i++) {
		int smallest=i;
		for (int j = i+1; j < brr.length; j++) {
			if(brr[j]<brr[smallest]){
				smallest=j;
			}
		}
		//swaping
		int temp=brr[smallest];
		brr[smallest]=brr[i];
		brr[i]=temp;
		
	}
	printArray(brr);
}
}
