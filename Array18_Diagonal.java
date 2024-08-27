public class Array18_Diagonal {
    public static void main(String[] args) {

        int arr[][] = {{12,34,56},{78,90,12},{34,56,78}};
        System.out.println("Array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Print the primary diagonal
        System.out.println("Primary diagonal: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i][i] + " ");
        }
        // Print the secondary diagonal
        System.out.println("\nSecondary diagonal: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i][arr.length-1-i] + " ");
        }

        
    }
    
}
