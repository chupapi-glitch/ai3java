package chupapi;
import java.util.Scanner;


/**
 * Write a description of class booleen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class booleen
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter First number:");
        int num1=sc.nextInt();
        
        System.out.print("Enter Second number:");
        int num2=sc.nextInt();
        
        boolean greaterThan =(num1 > num2);
        boolean equal=(num1 == num2);
        boolean lessThan=(num1 < num2);
        // OR condition
        boolean greaterOrEqual=(num1 > num2) || (num1 == num2);
        
        System.out.println("Is the first number greater than the second? " + greaterThan + 
                           "\nAre both numbers equal? " + equal + 
                           "\nIs the first number less than the second? " + lessThan +
                           "\nIs the first number greater or equal to second number" + greaterOrEqual);
                        }
}
