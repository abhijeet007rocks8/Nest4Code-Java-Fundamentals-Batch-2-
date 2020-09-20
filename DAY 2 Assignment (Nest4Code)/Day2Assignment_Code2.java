import java.util.*;
public class Day2Assignment_Code2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Feet: ");
        float feet=sc.nextFloat();
        System.out.print("Inches: ");
        float inches=sc.nextFloat();
        System.out.print("Kg: ");
        float weight=sc.nextFloat();
        double cm= (feet*12*2.54)+(inches*2.54);
        double pound=(weight*2.2);
        pound=Math.round(pound * 10) / 10.0;
        System.out.println("Height in cm: "+cm);
        System.out.println("Weight in pounds: "+pound);
    }
}

/*
Algorithm-:
Step 0-START
Step 1-Take the inputs of Feet,inches and Kg
Step 2-Convert feet into cm
Step 3-Convert inches into cm
Step 4-Add the values in Step 2 and 3 and store it
Step 5-Convert kg into Pound and store it
Step 6-Display the values in cm stored in Step 4 and pound stored in step 5
Step 7-END
*/
