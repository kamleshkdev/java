import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String args[])
    {
            LocalDateTime dt=LocalDateTime.now();
            DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Current Date is : "+df.format(dt)+"\n");

            DateTimeFormatter df1= DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.println("Current Date is : "+df1.format(dt)+"\n");

             DateTimeFormatter df2= DateTimeFormatter.ofPattern("E MMMM dd yyyy");
            System.out.println("Current Date is : "+df2.format(dt)+"\n");
            
            DateTimeFormatter df3= DateTimeFormatter.ofPattern("E MMMM hh:mm:ss yyyy");
            System.out.println("Current Date And Time is : "+df3.format(dt)+"\n");
            
            DateTimeFormatter df4= DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a ");
            System.out.println("Current Date And Time is : "+df4.format(dt)+"\n");
            
            DateTimeFormatter df5= DateTimeFormatter.ofPattern("hh:mm:ss");
            System.out.println("Current Time is : "+df5.format(dt)+"\n");
            
            DateTimeFormatter df6= DateTimeFormatter.ofPattern("w");
            System.out.println("Current week of the year is : "+df6.format(dt)+"\n");

             DateTimeFormatter df7= DateTimeFormatter.ofPattern("W");
            System.out.println("Current week of the month is : "+df7.format(dt)+"\n");

             DateTimeFormatter df8= DateTimeFormatter.ofPattern("D");
            System.out.println("Current Day of the year is : "+df8.format(dt)+"\n");
    }
    
}
