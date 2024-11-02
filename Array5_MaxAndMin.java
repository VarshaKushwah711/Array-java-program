//to find maximum and minimum value in array

public class Array5_MaxAndMin 
{
    static void max_and_min(int arr[])
    {
        int max=arr[0];
        int min=arr[0];
        for(int i= 0; i<arr.length; i++)
        {
            if(arr[i]>=max)
            {
                max=arr[i];
            }
            if(arr[i]<=min)
            {
                min=arr[i];
            }
        }
        System.out.println("maximum value in array -- " + max);
        System.out.println("minimum value in array -- " + min);
    }

    
    public static void main(String[] args) 
    {
        int arr[] = {15,14,3,12,15};
        Array5_MaxAndMin.max_and_min(arr);//call method
    }
}
