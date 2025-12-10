package Week6.Tutorial;
import java.util.Scanner;


/**
 * Write a description of class MatrixExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatrixExample
{
    public static void main(String[]arg)
    {
        int[][] matrix=new int[2][2];
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Enter data for matrix ");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display in the Matrix=");
        for(int x=0; x<2; x++)
        {
            for(int y=0; y<2; y++)
            {
                System.out.print(matrix[x][y]+"\t");
            }
            System.out.println();
        }
    }
}