package Assignment_28June;
//to print alternate elements in an array
public class Array3 
{
    public static void array()
    {
        int arr[] = {11,12,13,15,16,18};
        System.out.print("Array -- ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Alternate array -- ");
        for(int i=0; i<arr.length; i+=2)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        array();
    }
}
