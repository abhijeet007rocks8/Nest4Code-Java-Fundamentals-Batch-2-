import java.util.*;
class Day3Assignment_program3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input:");
        String s=sc.next();
        int start=0;
        int end=s.length()-1;
        int flag=0;
        while(start<=end)
        {
            if((s.charAt(start))==(s.charAt(end)))
            {
                start++;
                end--;
            }
            else
            {
                flag=-1;
                break;
            }
        }
        if(flag==0)
        System.out.println("Is Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
/*------------------OUTPUT----------------------------
Input:ababcbaba
Is Palindrome
Input:raceacar
Not Palindrome
Input:racecar
Is Palindrome
Input:ababa
Is Palindrome
     
 */