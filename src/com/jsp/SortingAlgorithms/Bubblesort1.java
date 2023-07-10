package com.jsp.SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort1 {
 void printArray(int[] arr){
	 System.out.println("The sorted array is---> ");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}
public static void main(String[] args) {
	//took userinput array..
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	System.out.println("Enter the values");
	int[] arr=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Unsorted array is---> "+Arrays.toString(arr));
	//iterate over an array
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if(arr[j]>arr[j+1]){
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	Bubblesort1 bubblesort1=new Bubblesort1();
	bubblesort1.printArray(arr);
	
}
}
