package doubt1;

class Main12 {

	static void name(){
		System.out.println("Sunilkumar");
	}
}
class Inherit extends Main12{
	static void name(){
		System.out.println("anilkumar");
	}
}
class Inheritance123{
	public static void main(String[] args) {
		Main12 m1=new Inherit();
		m1.name();
		
	}
}
