//9. Remove the first element of the array [11, 12, 13, 14].

public class Array31 {
    public static void main(String[] args) {
    
        int arr[] = {11,12,13,14};
        System.out.print("Old array: ");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        int newarr[] = new int[arr.length-1];
        
        for(int i=1; i<arr.length; i++)
        {
            newarr[i-1] = arr[i];
        }
        System.out.print("\nNew array: ");
        for(int i : newarr)
        {
            System.out.print(i+" ");
        }

    }
    
}
