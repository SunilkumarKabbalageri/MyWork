package DataStructuures;

public class pattern1 {
	public static void main(String[] args) {
		int no=9;
		for (int i = 1; i <=no; i+=2) {
			int x=1;
			for (int j = 1; j <=i; j++) {
				if(j<=i/2){
					System.out.print(x+" ");
					x++;
				}
				else{
					System.out.print(x+" ");
					x--;
				}
				
			}
			System.out.println();
		}
	}

}
