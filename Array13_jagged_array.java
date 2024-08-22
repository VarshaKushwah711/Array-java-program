public class Array13_jagged_array {
    public static void jaggedarray() {
        // Initialize a jagged array
        int[][] arr = new int[3][];
        arr[0] = new int[3]; // First row with 3 elements
        arr[1] = new int[5]; // Second row with 5 elements
        arr[2] = new int[2]; // Third row with 2 elements

        // Populate the jagged array with some values
        // First row
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        // Second row
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[1][3] = 7;
        arr[1][4] = 8;

        // Third row
        arr[2][0] = 9;
        arr[2][1] = 10;

        // Print the jagged array
        System.out.println("Jagged Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        jaggedarray(); // Call the method to display the jagged array
    }
}
