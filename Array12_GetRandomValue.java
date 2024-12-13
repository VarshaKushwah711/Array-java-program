import java.util.Random;
//To get random value in array
public class Array12_GetRandomValue 
{
    
    
    public String  random_array()
    {
        String arr[] = {"apple","mango","banana","grapes","orange","papaya"};
        Random obj1 = new Random();//Random  class
        String random_element = arr[obj1.nextInt(arr.length)];
        return random_element;
    }
    public static void main(String[] args) 
    {
        Array12_GetRandomValue obj = new Array12_GetRandomValue();
        System.out.println(obj.random_array());
    }
    
}
