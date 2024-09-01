public class Array22_Intersection {
    public static void main(String[] args) {
        int arr1[] = {4,3,7,9,2};
        int arr2[] = {5,1,4,8,3,7,9};
        //print 1st array
        System.out.print("first array: " );
        for(int i : arr1)
        {
            System.out.print(i+ " ");
        }
        //print 2nd array
        System.out.print("\nSecond array: ");
        for(int i : arr2)
        {
            System.out.print(i+" ");
        }
        System.out.print("\nIntersection of both array: ");
        for(int i : arr1)
        {
            for(int j : arr2)
            {
                if(i==j)
                {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
}
