package Week4;
import java.util.Scanner;


/**
 * Write a description of class usingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class usingSwitch
{
   public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        float mp, sp;       // marked price, selling price
        char cat;           // category of item
        System.out.print("Enter marked price: ");
        mp = sc.nextFloat();
        System.out.println("Enter the operator as A B C D");
        char operator=sc.next().charAt(0);
        
        switch(operator)
        {
            case 'A' : sp = mp - (mp * 0.60f);
                        System.out.println("discount is"+sp);
                        break;
            case 'B' : sp = mp - (mp * 0.40f);
                        System.out.println("discount is"+sp);
                        break;
            case 'C' : sp = mp - (mp * 0.20f);
                        System.out.println("discount is"+sp);
                        break;
            case 'D' : sp = mp - (mp * 0.10f);
                        System.out.println("discount is"+sp);
                        break;
            default: 
                    System.out.println("Invalid operator");
        }
    }
}