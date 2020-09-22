import java.util.*;
public class Day3Assignment_program3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Date: ");
        int date=sc.nextInt();
        if(date%400==0)
        System.out.println("Date in Leap Year");
        else if(date%4==0 && date%100!=0)
        System.out.println("Date in Leap Year");
        else
        System.out.println("Date not in Leap Year");
    }
}
/* OUTPUT-----------
   Date: 2020
Date in Leap Year
Date: 2300
Date not in Leap Year
Date: 2100
Date not in Leap Year
Date: 2000
Date in Leap Year

*/