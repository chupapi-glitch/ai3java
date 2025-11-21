import java.util.Scanner;

/**
 * Write a description of class StudentInformation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo {
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        
        
        String studentName = "Jay";
        int age = 19;
        double gpa = 3.7;
        
        System.out.println("Student Name:"+studentName);
        System.out.println("Age:"+age);
        System.out.println("GPA:"+gpa);
    }
}
