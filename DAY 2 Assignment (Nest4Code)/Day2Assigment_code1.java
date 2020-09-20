import java.util.*;
public class Day2Assigment_code1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Price 1:");
        float price1=sc.nextFloat();
        System.out.print("Price 2:");
        float price2=sc.nextFloat();
        System.out.print("Price 3:");
        float price3=sc.nextFloat();
        float total_price=price1+price2+price3;
        System.out.print("tax %:");
        float tax=sc.nextFloat();
        float Tax_Amount=(tax/100)*total_price;
        float Final_Amount=total_price +Tax_Amount;
        System.out.println("Final Amount:"+Final_Amount); 
    }
}

/*
Algorithm-
Step 0-START
Step 1-Take inputs of the cost of the three items and tax percentage
Step 2-Calculate the sum of the prices
Step 3-Calculate Tax_Amount 
Step 4-Add the Tax_Amount and sum of the prices
Step 5-Display the final Amount
Step 6-END
*/
