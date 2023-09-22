import java.util.*;
class BubbleSort {
static void bubblesort (int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1;j++)
        
            {
            if(a[j]>a[j+1])
            {
                //swap
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }      
        }    
    }
public static void main(String args[])
{
    int a[]=new int[100];
    int i,n;
    try (Scanner s = new Scanner(System.in))
     {
        System.out.println("How many Nos ??");
        n=s.nextInt();
        for(i=0;i<n;i++)
        a[i]=s.nextInt();
        bubblesort(a,n);
        System.out.println("Sorted array is");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        s.close();
    }
}
    
}
