//7. Remove the last element of the array [44, 55, 66, 77].
public class Array29 {
    public static void main(String[] args) {
        
        int arr[] = {44, 55, 66, 77};
        System.out.print("Old array: ");
        for(int i :arr)
        {
            System.out.print(i + " ");
        }

        int newarr[] = new int[arr.length-1];
        for(int i=0; i<newarr.length; i++)
        {
            newarr[i] = arr[i]; 
        }

        System.out.print("\nNew array: ");
        for(int i: newarr)
        {
            System.out.print(i + " ");
        }

    }
    
}
