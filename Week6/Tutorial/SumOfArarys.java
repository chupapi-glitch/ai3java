package Week6.Tutorial;
import java.util.Scanner;


/**
 * Write a description of class SumOfArarys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfArarys
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        int[] priceList={2, 4, 6, 8, 10};
        int sum=0;
        for(int i=0; i<priceList.length; i++)
        {
            sum=sum=priceList[i];
        }
        
        System.out.println("total sum is "+sum);
    }
}