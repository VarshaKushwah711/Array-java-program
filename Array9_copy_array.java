//copy all elements of one array to another array
import java.util.Scanner;
class Array9_copy_array
{
    void copy_array(int arr[])
    {
        int arr2[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            arr2[i] = arr[i];//to copy elements of arr[] into arr2[]
        }
        System.out.print("Elements of new array -- ");
        for(int i=0; i<arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array -- ");
        int size = obj.nextInt();
        System.out.println("Enter the elements of array -- ");
        int arr[] = new int[size];
        for(int i = 0 ; i<arr.length; i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.print("Elements of original array -- ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        new Array9_copy_array().copy_array(arr); 
        obj.close();
    }
}