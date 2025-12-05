package Week5.workshop;
import java.util.Scanner;


/**
 * Write a description of class backwardforward here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReversePalindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int numberTyped = num;
        int reverse = 0;

        while (num > 0) 
        {
            reverse = reverse * 10 + num % 10;
            num = num/10;
        }

        System.out.println("Reversed Number = " + reverse);
        if (numberTyped == reverse)
            System.out.println("The number is a Palindrome");
        else
            System.out.println("The number is NOT a Palindrome");
    }
}
