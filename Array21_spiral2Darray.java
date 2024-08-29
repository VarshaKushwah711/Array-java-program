// spiral 2d arrat matrix
public class Array21_spiral2Darray {
    public static void main(String[] args) 
    {
        int n=3;
        int matrix[][] = new int[n][n];
        int left=0, right=n-1, top=0, bottom=n-1;
        int num = 1;
        while(left<= right && top<=bottom)
        {
            for(int i=0; i<=right; i++)
            {
                matrix[top][i] = num++;
            }
            top++;
            for(int i=top; i<=bottom;i++)
            {
                matrix[i][right] = num++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if (left <= right) {
                // Fill left column
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
            left++;
            }
        }
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }   
    }
}
