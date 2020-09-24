import java.util.*;
public class Day5Assignment_program2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number: ");
        int n=sc.nextInt();
        System.out.print("Output: ");
        for(int i=n+1;;i++)
        {   int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
/*-------------------------------OUTPUT----------------------------------------

Number: 132
Output: 137
Number: 5
Output: 7
Number: 111
Output: 113

*/