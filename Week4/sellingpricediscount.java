package Week4;
import java.util.Scanner;


/**
 * Write a description of class sellingpricediscount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class sellingpricediscount extends usingSwitch
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        float mp, sp;   // marked price, selling price
        char item;       // category of item

        System.out.println("Enter price of an item=");
        mp = sc.nextFloat();

        System.out.print("Enter category (A, B, C, D): ");
        item = sc.next().charAt(0);

        if (item == 'A' ) 
        {
            sp = mp - (mp * 0.60f);
        }
        else if (item == 'B') 
        {
            sp = mp - (mp * 0.40f);
        }
        else if (item == 'C') 
        {
            sp = mp - (mp * 0.20f);
        }
        else if (item == 'D')
        {
            sp = mp - (mp * 0.10f);
        }
        else {
            System.out.println("Invalid category!");
            return;
        }

        System.out.println("Selling Price = " + sp);
    }
}