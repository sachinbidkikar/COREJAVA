import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first array size ");
        int size = sc.nextInt();
        System.out.println("enter the second array size ");
        int size1 = sc.nextInt();
        int[][] array = new int[size][size1];
        System.out.println("enter the elements for 2D array");
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size1;j++)
            {
                array[i][j] =sc.nextInt();
            }
        }
        System.out.println("array elements of 2D array is: ");
        for (int i=0; i<size; i++)
        {
            for (int j=0; j<size1; j++)
            {
                System.out.print(array[i][j]);
            }
        }
    }
}