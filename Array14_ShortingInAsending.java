public class Array14_ShortingInAsending 
{
    public static void main(String[] args) 
    {
        int number[] = {3, 2, 5, 7, 9, 8, 1, 4, 6};
        //System.out.println(number.length);
        for(int i = 0; i<number.length; i++)
        {
            for(int j=0; j<number.length-1; j++)
            {
                int temp = 0;
                if(number[j]>number[j+1])
                {
                    temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }    
        }
        System.out.println("shorting in asending order: ");
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
    }   
}
