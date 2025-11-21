/**
 * Write a description of class pharmacist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MedicineInventory extends CopyOfMedicineInventory {
    public static void main(String[] args) 
    {   
        //store information
        String medicineName="Cough_Syrup";
        double pricePerTablet= 4.5; //NPR
        int numberOfTablet=5;
        
        //Display formatted report
        System.out.println("Medicine Name      : " + medicineName);
        System.out.println("Price per Tablet   : NPR " + pricePerTablet);
        System.out.println("Quantity in Stock  : " + numberOfTablet);
    }
}
