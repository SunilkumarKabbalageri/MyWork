package doubt1;

public class doubt21 {
public static void main(String[] args) {
	 int n=5;
	 for(int i=0;i<n;i++){
		 for(int j=0;j<n;j++){
			 if(i==0&&j==0&&i==n&&j==n)
			 System.out.print(" "); 
			 else
				 System.out.println("*"+" ");
		 }
		 System.out.println();
		 int g=3;
		 System.out.println(++g*8);
	 }
}
}
