import java.util.Scanner;

class APRectangle{
    public static void main(String args[])
    {
        Float l,b,a,p;
        Scanner sc =new Scanner(System.in);
        System.out.print("\n enter length of rectangle:\t");
        l=sc.nextFloat();
         System.out.print("enter breadth of rectangle:\t");
        b=sc.nextFloat();
        a=l*b;
        p=2*(l+b);
         System.out.println("\n Area of rectangle:\t\t"+a);
          System.out.println("\n perimeter of rectangle:\t"+p+"\n");

          sc.close();
          System.out.println();
    }
}