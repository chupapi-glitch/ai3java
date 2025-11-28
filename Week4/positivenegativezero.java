package Week4;
import java.util.Scanner;


/**
 * Write a description of class positivenegativezero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class positivenegativezero
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number=");
        int num=sc.nextInt();
          if (num>0)
        {
            System.out.println("positive");
        }
        else if (num<0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}