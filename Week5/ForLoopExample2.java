package Week5;


/**
 * Write a description of class wewew here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoopExample2
{
    public static void main(String[]arg)
    {
        int sum=0;
        for(int x=1; x<=10; x++)
        {
            if(x%2==0)
            {
                //sum-sum+x
                sum+=x;
                System.out.println("Sum="+sum);
            }
        }
        System.out.println("Total="+sum);
    }
}