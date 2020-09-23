import java.util.*;
public class Day4Assignment_program1
{
    public static void main(String[] args)
    {
        int odd=0;
        int even=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Number:"); 
        long number=sc.nextLong();  
        number=Math.abs(number);
        while(number>0)
        {
            long r=number%10;
            if(r%2==0)
            even++;
            else
            odd++;
            number=number/10;
        }
        System.out.println("Odd digits: "+odd);
        System.out.println("Even Digits: "+even);
    }
}
/*------------------------------------------------OUTPUT------------------------------------------------------

Number:2468
Odd digits: 0
Even Digits: 4

Number:-234569000002
Odd digits: 3
Even Digits: 9

   
*/