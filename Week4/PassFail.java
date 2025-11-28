package Week4;
import java.util.Scanner;


/**
 * Write a description of class PassFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFail
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark of the student=");
        int marks=sc.nextInt();
        if ((marks<=100) && (marks>=40))
        {
            System.out.println("Pass");
        }
        else if ((marks<40) && (marks>=0))
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}