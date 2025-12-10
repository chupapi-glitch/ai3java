package Week6.Tutorial;
import java.util.Scanner;


/**
 * Write a description of class UserInputToArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputToArray
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        String[] StudentList=new String[5];
        
        for(int i=0; i<StudentList.length; i++)
        {
            System.out.println("Enter the name of Student");
            StudentList[i]=sc.nextLine();
        }
        
        System.out.println("SDisplay the data of an array");
        
        for(int j=0; j<StudentList.length; j++)
        {
            System.out.println("Name of the student is \t" +StudentList[j]+"\t");
        }
    }
}