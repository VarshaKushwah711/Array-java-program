//ask user to input array and traverse 
import java.util.Scanner;
public class Array8_input 
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of array -- ");
        int size = obj.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter array values -- ");
        for(int i = 0; i<size; i++)
        {
            arr[i]=obj.nextInt();
            //System.out.println("--"+arr[i]);
        }

        System.out.print("Array -- ");
        for(int i = 0; i<arr.length; i++ )//to traverse array
        {
            System.out.print(arr[i] +" ");
        }
        obj.close();
        
    }
}
