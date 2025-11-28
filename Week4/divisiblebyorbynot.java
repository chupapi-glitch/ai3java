package Week4;
import java.util.Scanner;


/**
 * Write a description of class divisiblebyorbynot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisiblebyorbynot
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num1=sc.nextInt();
        if(num1%3==0)
        {
            if(num1%5==0)
                {
                    System.out.println("divisible by 3 and 5");
                }
            else
                {
                    System.out.println("divisible by 3 but not 5");
                }
        }
        else
        {
            if(num1%5==0)
                {
                    System.out.println("not divisible by 3 but 5");
                }
            else
                {
                    System.out.println("not divisible by 3 and 5");
                }
        }
    }
}