import java.util.*;
class MenuMatrix{
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("1)addition of matrix");
        System.out.println("2)multiplication of matrix");
        System.out.println("3)transpose of matrix");
        System.out.println("4)exit");
        
        int a[][]=new int [3][3];
        int b[][]=new int [3][3];     
        int c[][]=new int [3][3];
        int ch=sc.nextInt();                 
        switch(ch)
       {
                case 1: 
                        System.out.println("enter 9 values for 1st matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {
                                a[i][j]=sc.nextInt();
                            }
                        }
                       
                        System.out.println("enter 9 values for 2nd matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {
                                b[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Addition of matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {   
                                c[i][j]=a[i][j]+b[i][j];
                                System.out.print(c[i][j]+"\t");
                            }
                            System.out.print("\n");
                        }



                
                case 2: 
                        System.out.println("enter 9 values for 1st matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {
                                a[i][j]=sc.nextInt();
                            }
                        }
                       
                        System.out.println("enter 9 values for 2nd matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {
                                b[i][j]=sc.nextInt();
                            }
                        }
                        System.out.println("Multiplication of matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {   
                                c[i][j]=a[i][j]*b[i][j];
                                System.out.print(c[i][j]+"\t");
                            }
                            System.out.print("\n");
                        }
                



                case 3:
                         
                        System.out.println("enter 9 values for transpose matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {
                                a[i][j]=sc.nextInt();
                            }
                        }
                       
                        
                        System.out.println("Transpose of matrix");
                        for(int i=0;i<3;i++)
                        {
                            for(int j=0;j<3;j++)
                            {   
                                System.out.print(a[j][i]+"\t");
                            }
                            System.out.print("\n");
                        }
                


       }
       sc.close();//adding close for scanner for efficient use of memory
        
    }
}