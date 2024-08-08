package Assignment_28June;
// to find missing elments in the array
public class Array2 
{
    public static void array()
    {
        int arr[] = {11,12,13,15,17,19};
        System.out.print("Array -- ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max=arr[arr.length-1];//last limit of  range
        for(int i=arr[0]; i<max; i++)
        {
            boolean found = false;
            for(int j : arr)//arr[i]
            {
                //System.out.print(" i- "+i+" j- "+j);
                if(j==i)
                {
                    found=true;
                    //System.out.println(" j-- "+j+" i-- "+i);
                    break;
                }
            }
            if(!found)//find missing
            {
                System.out.println("Missing elements -- " +i+" ");
            }

        }
    }
    public static void main(String[] args) {
        array();
    }
}
