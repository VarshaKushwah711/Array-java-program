//6. Add an element to the end of the array [1, 2, 3].

public class Array28 {

    public static void main(String[] args) {

        int arr[] = {34, 45, 67, 98};
        System.out.print("Old Array:");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        int newarr[] = new int[arr.length+1];
        for(int i = 0; i<arr.length; i++)
        {
            newarr[i] = arr[i];
        }
        newarr[arr.length] = 78;
        System.out.print("New Array:");
        for(int i : newarr)
        {
            System.out.print(i+" ");
        }

    }

    
}
