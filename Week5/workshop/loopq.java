package Week5.workshop;


/**
 * Write a description of class loopq here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loopq
{
    public static void main(String[]arg)
    {
        for (int i=5; i>=1; i--) 
        {      
            for (int j = 5; j >= i; j--) 
                {
                    System.out.print(j + " ");
                }
                    System.out.println();
        }
    }
}