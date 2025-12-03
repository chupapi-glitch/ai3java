package Week5;
import java.util.Scanner;


/**
 * Write a description of class ResturantManagementSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResturantManagementSystem
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        int quantity;
        int totalBill=0;
        do
        {  
            System.out.println("Resturant Menu");
            System.out.println("1:Pizza Rs500");
            System.out.println("2:MoMo Rs300");
            System.out.println("0:Bill");
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("You hace ordered a Pizza");
                        System.out.println("Enter the quantity");
                        quantity=sc.nextInt();
                        totalBill=totalBill+quantity*500;
                        break;
                case 2:System.out.println("You hace ordered a MoMo");
                        System.out.println("Enter the quantity");
                        quantity=sc.nextInt();
                        totalBill+=quantity*300;
                        break;
                case 0:System.out.println("TotalBill="+totalBill);
                        break;
                        default:System.out.println("Please try again lol");
            }
        }while(choice!=0);
    }
}