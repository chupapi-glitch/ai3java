package Week6.WorkShop;
import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class NumberArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberArray
{
    public static void mai(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        int[] marks={12,23,34,45};
        int sum=0;
        for (int i=0; i< marks.length; i++)
        {
            int number= marks[i];
            sum+= number;
            System.out.println(marks[i]);
        }
        System.out.println("total sum= "+sum);
        int average=0;
        average = sum/marks.length;
        System.out.println("total average= "+average);
    }
}