import java.util.Scanner;
public class SecondSmallest {
    public static void main(String args[]){
            int max;
        System.out.println("Enter the size:");
        Scanner sc=new Scanner(System.in);
        max=sc.nextInt();
        int a[]=new int[max];
            int total=a.length;
            System.out.println("Enter the array:");

            for(int j=0;j<total;j++){
                int num=sc.nextInt();
                a[j]=num;
            }
            System.out.println("Second Smallest: "+getSecondSmallest(a,total));
        }
    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
}