
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args) 
    {
       double originalPrice = 60.0;
       double discount = 20.0;              

        // Apply discount
        double finalPrice = originalPrice - (originalPrice * (discount / 100));

        System.out.println(finalPrice); // Output: 48
        
    }
}