//to find odd values in array
public class Array7_odd 
{
    static void odd(int arr[])
    {
        System.out.print("odd values in array: ");
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
     Array7_odd.odd(new int[]{1,3,14,13,12,17,9});//pass anonymous array   
    }
}
