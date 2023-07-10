package doubt1;

 abstract class tester{
	  void number()
	{
		System.out.println("hiie");
	}
	
}
 class Demo extends tester{
	 void number(){
		 super.number();
		 System.out.println("yes one number entered");
		 
	 }
	 
 }
public class doubt11 {
public static void main(String[] args) {
	Demo d1=new Demo();
	d1.number();
	//d1.number1();
}
}
