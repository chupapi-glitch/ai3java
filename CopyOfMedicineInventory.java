import java.util.Scanner;

/**
 * Write a description of class pharmacist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyOfMedicineInventory {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //store information
        System.out.println("Enter the name of medcine:");
        String yeet = sc.nextLine();
        
        System.out.println("Enter price of per tablet in NPR:");
        double meet = sc.nextDouble();
        
        System.out.println("Enter the number of tablets:");
        int shit = sc.nextInt();
        
        double beep = meet*shit; //total price
        
        
        //Display formatted report
        System.out.println("Medicine Name      : " + yeet);
        System.out.println("Price per Tablet   : NPR " + meet);
        System.out.println("Quantity in Stock  : " + shit);
    }
}
