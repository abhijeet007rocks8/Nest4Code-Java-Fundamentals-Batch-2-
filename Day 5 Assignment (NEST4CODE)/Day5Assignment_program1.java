import java.util.*;
public class Day5Assignment_program1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: ");
        int n=sc.nextInt();
        System.out.print("OUTPUT: 0 1 ");
        int a=0;int b=1;
        for(int i=2;i<n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        System.out.println();
    }
}
/*--------------------------OUTPUTS-------------------------------------
   
Input: 10
OUTPUT: 0 1 1 2 3 5 8 13 21 34 
Input: 5
OUTPUT: 0 1 1 2 3 
Input: 2
OUTPUT: 0 1 

*/