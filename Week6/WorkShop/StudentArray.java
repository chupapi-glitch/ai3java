package Week6.WorkShop;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a description of class StudentArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentArray
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many students do you want to store?");
        
        int numberOfStudents=sc.nextInt();
        sc.nextLine();
        
        String[] names = new String[numberOfStudents];
        for (int i=0; i<numberOfStudents; i++)
        {
            System.out.println("Enter a name:");
            //String name= sc.nextLine();
            names[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}