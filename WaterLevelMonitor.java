    import java.util.Scanner;

/**
 * Write a description of class WarerLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water level in literes:");
        int waterLevel= sc.nextInt();
        System.out.println("Current water level:"+waterLevel+"L");
        
        String message = (waterLevel >= 1000)
        ? "WARNING: Water level has reached 1000L or more!"
        : "Status: Normal";
        System.out.println(message);
    
        
    }
}