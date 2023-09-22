import java.util.*;
public class NameSort {
    public static void main(String args[])
    {
        int n;
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many names");
        n=sc.nextInt();
        String names[]=new String[n];
        System.out.println("enter city names");
        Scanner sc1=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            names[i]=sc1.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.println("Sorted list of cities");
        // for printing names in decending order
        for (int i = names.length - 1; i >= 0; i--) 
        {
            System.out.println(names[i]);
        }
        // closing scanner after use for less wastage of memory
            sc.close();
            sc1.close();
    }
    
}
