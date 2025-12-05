package Week5.workshop;


/**
 * Write a description of class SumOfOddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfOddEven
{
    public static void main(String[]arg)
    {
        int oddSum =0, evenSum=0;
        for (int i = 1; i<=10; i++) 
        {
            if (i%2==0)
                evenSum += i;
            else
                oddSum += i;
        }
        System.out.println("Sum of odd numbers = "+oddSum);
        System.out.println("Sum of even numbers = "+evenSum);
    }
}