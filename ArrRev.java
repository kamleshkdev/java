import java.util.Scanner;

public class ArrRev {
    public static void main(String args[])
    {
        int a[]=new int[50];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many integers in array");
        n=sc.nextInt();
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse Array Elements");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        sc.close();
     }   
    
    
}
