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