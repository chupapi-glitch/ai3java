package Week5.workshop;
import java.util.Scanner;


/**
 * Write a description of class OddEvenPolice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEvenPolice
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int even=0, odd=0;
        int k=num;
        while (num>0)
        {
            int digit = num % 10;

                if (digit % 2 == 0) 
                    even++;
                else 
                    odd++;
            num=num/10;
        }
        System.out.println("Even digits = "+even);
        System.out.println("Odd digits = "+odd);
    }
}