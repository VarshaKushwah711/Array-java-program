//8. Add an element to the beginning of the array [8, 9, 10].

public class Array30 
{
    public static void main(String[] args) 
    {
        
        int arr[] = {55, 66, 77, 88};
        System.out.print("Old array: ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        int newarr[] = new int[arr.length+1];
        newarr[0] = 99;
        for(int i=1; i<newarr.length; i++)
        {
            newarr[i] = arr[i-1];
        }
        System.out.print("\nNew array: ");
        for(int i : newarr)
        {
            System.out.print(i+" ");
        }
    }
}