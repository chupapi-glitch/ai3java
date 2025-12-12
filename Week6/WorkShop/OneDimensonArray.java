package Week6.WorkShop;


/**
 * Write a description of class OneDimensonArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OneDimensonArray
{
    public static void main(String[]arg)
    {
        int[]age; // array declaration
        age=new int[5]; // array construction
        
        age[0]=13;
        age[1]=15;
        age[2]=20;
        age[3]=25;
        age[4]=35;
        
        System.out.println("age="+age[0]);
        System.out.println("age="+age[1]);
        System.out.println("age="+age[2]);
        System.out.println("age="+age[3]);
        System.out.println("age="+age[4]);
    }
}