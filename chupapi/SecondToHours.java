package chupapi;
import java.util.Scanner;


/**
 * Write a description of class SecondToHours here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondToHours
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any second:");
        int num1=sc.nextInt();
        
        int second=num1*1;
        int minutes=num1/60;
        int hours=num1/3600;
        System.out.println("Second="+second+"\nMinutes="+minutes+"\nHours="+hours);
    }
}