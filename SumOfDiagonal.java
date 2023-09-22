import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args)
     {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        System.out.println("enter 2x2 matrix elements");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n\nThe Matrix is \n");
         for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length;j++)
            {
            
                System.out.print("\t"+a[i][j]+"\t");
            }
            System.out.print("\n");
        }
         System.out.print("\n\n");
         
        System.out.println("1)Sum of diagonal elements");
        System.out.println("2)Sum of upper diagonal elements");
        System.out.println("3)Sum of lower diagonal elements");
        System.out.println("4)exit");
        int ch = sc.nextInt();
        int sum=0;
        switch (ch) {
            case 1:     
                     for (i = 0; i <a.length; i++)
                    {
                         for(j=0;j<a.length;j++)
                        {
                            sum=sum+ a[i][j];
                        }
                    }
                System.out.println("The sum of the diagonal elements is: " + sum);
                break;
            case 2:
                    for(i=0;i<a.length-1;i++)
                    {
                        for(j=i+1;j<a.length;j++)
                        sum=sum+a[i][i];
                    }
                    System.out.println("Sum of upper diagonal elements"+sum);
                break;
            case 3:
                    for(i=0;i<a.length;i++)
                    {
                        for(j=0;j<i;j++)
                        {
                        sum=sum+a[i][j];
                        }
                    }
                    System.out.println("Sum of lower diagonal elements"+sum);
                    
                break;
        
            default:
                break;
        }
       
    }
    
}
