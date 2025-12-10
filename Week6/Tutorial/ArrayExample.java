package Week6.Tutorial;


/**
 * Write a description of class ArrayExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayExample
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
        
        int []number=new int[5];
        int x=10;
        for(int i=0;i<number.length;i++)
        {
            number[i]=x;
            x=x+10;
        }
        
        System.out.println("Display using loop"); 
        for(int y=0; y<number.length;y++)
        {
            System.out.println(number[y]);
        }
    }
}