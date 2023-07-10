package DataStructuures;

import java.util.Stack;

public class Stack11 {
public static void main(String[] args) {
	String s1="boy good a is Ramu";
	String[] arr=s1.split(" ");
	int count=0;
	Stack<String> s11=new Stack<String>();
	for(int i=0;i<arr.length;i++)
	{
		s11.push(arr[i]);
		count++;
    }
	String[] r1=new String[count];
	while(s11!=null){
		System.out.println(s11.pop());
	}
	}
	

}
