package Week5;
import java.util.Scanner;


/**
 * Write a description of class ForLoopExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoopExample
{
public static void main(String[]arg)
    {
        for(int x=1; x<=10; x++)
        {
            if(x%2==0)
            {
                System.out.print(x+"\t");
            }
        }
    }
}