//find most frequent elements in array 
package Assignment_28June;
public class Array1 
{
    static int count;
    public static void arr()
    {
        int arr[] = {22,32,45,22,56,22,78};
        int max_count=0;
        int max_time = 0;
        System.out.print("Array elements -- ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++)
        {
            count=0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                
                }
                if(count>max_count)
                {
                    max_count=count;
                    max_time=arr[i];
                }
            }
        }
        System.out.println("Most time elements occurred in array -- " + max_time);
        System.out.println("Count -- " + max_count);
    }
    public static void main(String[] args) {
        arr();
    }   
}
