//for-each loop & String array
public class Array10_for_each 
{
    static void for_each()
    {
        String student[] = {"varsha", "mansi", "saloni", "shivani"};//string array
        for(String i:student)//for-each loop
        {
            System.out.println(i);
        }
        int arr[] = {1,2,3,4,5,6};
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) 
    {
        for_each();
    }
    
}
