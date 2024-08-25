public class Array15_EvenSum {
    public static void main(String[] args) {
        
        int number[] = {3, 2, 5, 7, 9, 8, 1, 4, 6};
        int sum = 0;
        for(int i = 0; i< number.length; i++)
        {
            if(number[i]%2==0)
            {
                sum += number[i];
            }
        }
        
        System.out.println(sum);
    }
}
