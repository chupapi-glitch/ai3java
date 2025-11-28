package Week4;
import java.util.Scanner;


/**
 * Write a description of class Example1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamMarkSheet extends GPAtoGrade

{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int percentage=sc.nextInt();
        if ((percentage<=100) && (percentage>=90))
        {
            System.out.println("Distinction");
        }
        else if ((percentage>=70) && (percentage<90))
        {
            System.out.println("First Dicision");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}