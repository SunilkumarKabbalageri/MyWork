package PrgInCollectionsss;

import java.util.Scanner;

class Sample{
	int count=0;
      void num(int n){
    	  for (int i=1;i<n;i++){
    		  count++;
    	  }
      }
}
class Demo extends Sample{
	void num(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
      String n=sc.nextLine();
		System.out.println(n);
		super.num(n.length());
	}
}
public class prg5 {
public static void main(String[] args) {
	Demo demo=new Demo();
	demo.num();
	Sample sample=new Sample();
	System.out.println(sample.count);
}
}
