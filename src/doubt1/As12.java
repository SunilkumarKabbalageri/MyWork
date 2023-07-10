package doubt1;

import java.util.Scanner;

public class As12 {
public  void main(int n) {
	//int n=5;
	boolean flag=true;
	for(int i=2;i<n;i++){
		if(n%i==0&&n>1){
			flag=false;
			break;
		}
	}
	if(flag){
		System.out.println(" yes it is a prime no-->true");
	}
	else
		System.out.println("flase");
}
public static void main(String[] args) {
	System.out.println("Enter the values");
	Scanner sc=new Scanner(System.in);
	new As12().main(sc.nextInt());
}
}
