import java.util.Arrays;
import java.util.Scanner;
public class ReverseSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.close();
		int a[]=new int[10];
		System.out.println("Enter array values:");
		for(int i=0;i<10;i++) {
		  a[i]=sc.nextInt();
		  }
		ReverseSort obj=new ReverseSort();
		obj.revArray(a);
	}

void revArray(int a[])
{
		String str=Arrays.toString(a);
		
	    Arrays.sort(a);
	    System.out.println("sorted array is:"+Arrays.toString(a));
	    
	}


}