package chupapi;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();

        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        
        int sum=num1+num2;
        int subtraction=num1-num2;
        int product=num1*num2;
        int divide=num1/num2;
        int modulus=num1%num2;
        
        System.out.println("sum:"+sum);
        System.out.println("subtraction:"+subtraction);
        System.out.println("Product:"+product);
        System.out.println("divide"+divide);
        System.out.println("modulus"+modulus);
    }
}