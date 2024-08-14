//to find average of array
public class Array6_average 
{
    static float average(int arr[])
    {
        int sum = 0;
        float avg = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println("Total of array -- " + sum);
        //System.out.println(avg);
        return avg;
    }
    public static void main(String[] args) 
    {
        //int arr[] = {15,14,93,12,10};
        float average = Array6_average.average(new int[]{15,14,3,12,15});
        System.out.println("average of array -- " + average);
    }
}
