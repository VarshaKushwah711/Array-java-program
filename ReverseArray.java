class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[arr.length]; 
        int c = 0;

        for (int i = arr.length - 1; i >= 0; i--) {  
            arr2[c] = arr[i];
            c++;
        }
        
        for (int i : arr2) {
            System.out.println("s: " + i);
        }
    }
}
