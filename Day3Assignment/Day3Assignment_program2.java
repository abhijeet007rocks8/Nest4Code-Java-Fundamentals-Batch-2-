import java.util.*;
public class Day3Assignment_program2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("String 1:");
        String s1=sc.nextLine();
        System.out.print("String 2:");
        String s2=sc.nextLine();
        String s1front=s1.substring(0,2);
        String s1end=s1.substring(s1.length()-2);
        String s2front=s2.substring(0,2);
        String s2end=s2.substring(s2.length()-2);
        String res1=s2end+s1.substring(2,s1.length()-2)+s2front;
        String res2=s1end+s2.substring(2,s2.length()-2)+s1front;
        System.out.println("String 1: "+res1);
        System.out.println("String 2: "+res2);
    }
}
/*------------------------OUTPUT---------------------
String 1:abcd
String 2:efgh
String 1: ghef
String 2: cdab

*/