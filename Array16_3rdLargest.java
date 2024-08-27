public class Array16_3rdLargest {
    public static void main(String[] args) 
    {
        int number[] = {1,3,5,7,9,6,8,2,4,10};
        for(int i=0; i<number.length; i++)
        {
            for(int j=0; j<number.length-1; j++)
            {
                int temp = 0;
                if(number[j]<number[j+1])
                {
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }
        System.out.print("3rd largest number: " + number[2]);
    }
    
}
