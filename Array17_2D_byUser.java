import java.util.Scanner;

public class Array17_2D_byUser 
{
    public static void main(String[] args) {
        
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of 1st matrix : ");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix : ");
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[i].length; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        // sum of 2d matrix
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //to print addtion 
        System.out.println("Addtion of both matrix : ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(c[i][j]+ "\t");
            }
            System.out.println();
        }

    }
     
}
