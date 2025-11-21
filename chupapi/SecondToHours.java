package chupapi;
import java.util.Scanner;


/**
 * Write a description of class SecondToHours here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondToHours
{
    public static void main(String[]arg)
   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total seconds");
        int totalSeconds = sc.nextInt();
        
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.println("Hours"+hours+"\nMinutes"+minutes+"\nsecond"+seconds);

    }
}