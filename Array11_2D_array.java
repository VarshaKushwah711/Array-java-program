//2-Dimensional array and find length
public class Array11_2D_array {
    static void multidimensinal()
    {
        //create a 2D array
        int array[][] = {{1,2,3,}, {4,5,6,}, {7,8,9,}};
        //calculate the length of each row
        System.out.println("Length of row 1 -- " + array[0].length);
        
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array.length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) 
    {
        multidimensinal();    
    }
    
}
