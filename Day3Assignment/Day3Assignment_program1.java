import java.util.*;
public class Day3Assignment_program1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in seconds");
        int s=sc.nextInt();
        int min=0,hours=0,day=0;
        if(s>59)
        {
            min=s/60;
            s=s%60;
        }
        if(min>59)
        {
            hours=min/60;
            min=min%60;
        }
        if(hours>23)
        {
            day=hours/24;
            hours=hours%24;
        }
         System.out.println(day+" Days "+hours+" Hours "+min+" Minutes "+s+" Seconds");    
    }
}
/*---------OUTPUT------------
   Enter time in seconds
360000
4 Days 4 Hours 0 Minutes 0 Seconds
Enter time in seconds
36123
0 Days 10 Hours 2 Minutes 3 Seconds
*/