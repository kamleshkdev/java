import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        {
            int i,j,c,n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            c=1;
            for(j=1;j<n;j++)
        {
            for(i=1;i<=10;i++)
            {
               c=i*n;
               System.out.println(c);
            }
System.out.print("\t");
        }
    }
 }
}
