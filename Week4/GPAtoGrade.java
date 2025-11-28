package Week4;
import java.util.Scanner;


/**
 * Write a description of class GPAtoGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPAtoGrade
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        float gpa=sc.nextInt();
        if (gpa>4.1)
        {
            System.out.println("Error");
        }
        else if ((gpa<=4.0) && (gpa>=3.5))
        {
            System.out.println("A");
        }
        else if ((gpa>=3.0) && (gpa<3.5))
        {
            System.out.println("B");
        }
        else if ((gpa>=2.0) && (gpa<2.5))
        {
            System.out.println("C");
        }
        else if ((gpa>=1.5) && (gpa<2.0))
        {
            System.out.println("d");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}