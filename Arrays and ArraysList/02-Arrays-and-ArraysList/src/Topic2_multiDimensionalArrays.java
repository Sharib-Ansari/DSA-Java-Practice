/*
     it is something like array of arrys
     {
     {1,2,3}
     {4,5,6}
     {7,8,9}
     }
     initialize by
     int[this is for row][this is for column] name of array = new int [compulsory row no.][not necessary col no,]
*/
import java.util.Scanner;

public class Topic2_multiDimensionalArrays
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = input.nextInt();

        System.out.print("Enter Columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter Array Elements:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your Array is:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
