//5. Replace the third element in the array [1, 2, 3, 4, 5] with 99.
public class Array27 {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        System.out.print("Old Array: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }


        System.out.print("\nNew Array: ");
        for(int i=0; i<arr.length; i++)
        {
            if(i==2)
            {
                arr[i] = 99;
            }
            System.out.print(arr[i]+" ");
        }
        

    }
    
}

