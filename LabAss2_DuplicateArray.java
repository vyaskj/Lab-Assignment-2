import java.util.*;
public class LabAss2_DuplicateArray{	//specifying class
public static int modifyarray(int arr[], int n){	//creating array
        if (n==0 || n==1){		
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
         }
        temp[j++] = arr[n-1];  
       
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
     
    public static void main (String[] args) {
    int size;
    System.out.println("Enter the size of array:");
    Scanner sc=new Scanner(System.in);
    size=sc.nextInt();
    int arr[] =new int[size];
    System.out.println("Enter the elements:");
    for(int j=0;j<size;j++){
    int num=sc.nextInt();
        arr[j]=num;
        }
        Arrays.sort(arr);
        int length = arr.length;
        length = modifyarray(arr, length);
       
        for (int i=length-1; i>=0; i--)
           System.out.print(arr[i]+" ");
    }
}