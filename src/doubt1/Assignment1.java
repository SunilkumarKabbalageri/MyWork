package doubt1;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		
	
int[] arr1={1,2,3,4};
int[] arr2={4,5,6,7};
int[] arr3={4,11,9,13};
int[] ans=new int[arr1.length+arr2.length+arr3.length];
int x = 0,y=0;

for(int i=0;i<(ans.length);i++){
	if(i<arr1.length){
		ans[i]=arr1[i];
	}
	else if(i<(arr1.length+arr2.length)){
		ans[i]=arr2[x];
		x++;
	}
	else if(i>=(arr1.length+arr2.length)){
		ans[i]=arr3[y];
		y++;
	}
}
//System.out.println(Arrays.toString(ans));
ArrayList l1=new ArrayList();
for (int i = 0; i < ans.length; i++) {
	l1.add(ans[i]);
//	System.out.println(l1.retainAll(ans[i]));
}
ArrayList l2=new ArrayList();
for (int i = 0; i < ans.length; i++) {
	l1.add(ans[i]);
}

l1.retainAll(l2);
System.out.println(l2);





}
}