import java.util.*;
public class MenuDriven{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1)calculate volume of cylinder");
        System.out.println("2)Factorial");
          System.out.println("3)Armstrong");
            System.out.println("4)exit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                float  v,r,h;
                 System.out.println("enter radius of cylinder");
                r=sc.nextFloat();
                  System.out.println("enter height of cylinder");
                h=sc.nextFloat();
                v=3.14f*(r*r)*h;
                 System.out.println("volume of cylinder ="+v);

            break;
            case 2:
                    int n,fact=1;
                    System.out.println("enter no");

                    n=sc.nextInt();
                    for(int i=1;i<=n;i++)
                    {
                        fact=fact*i;
                    }
                    System.out.println("factorial = \n"+fact);
            
                
            break;
            case 3:   
            int a,arm=0,rem,c;
            System.out.println("enter no");
            a=sc.nextInt();
            c=a;
            while(a>0)
            {
                rem=a%10;
                arm=(rem*rem*rem)+arm;
                a=a/10;
            }
            if(c==arm)
                System.out.println("armstrong no");
            else
                System.out.println("not arm");
        }
            sc.close();
    }
}