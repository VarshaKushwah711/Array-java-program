//anonymous we can use only one time whenever they declare 
public class Array3_Anonymous 
{
    public static void print_array(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        print_array(new int[]{15,14,3,12});
    }
}
