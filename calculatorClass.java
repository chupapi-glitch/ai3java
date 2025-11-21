import java.util.Scanner;

/**
 * Write a description of class calculatorClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculatorClass
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter first number:");
        double num1=sc.nextInt();

        System.out.print("Enter second number:");
        double num2=sc.nextInt();
        
        double sum=num1+num2;
        double difference=num1-num2;
        double product=num1*num2;

        System.out.println("Sum:"+sum);
        System.out.println("Difference:"+difference);
        System.out.println("Product:"+product);

        sc.close();
    }
}