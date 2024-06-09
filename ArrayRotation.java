package Allproject;
public class ArrayRotation {    
    // Function to rotate array left by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    // Function to reverse array elements from start to end index
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    // Main method to demonstrate array rotation
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2; // Number of positions to rotate
        System.out.println("Original Array: ");
        printArray(arr);
        
        leftRotate(arr, d);
        
        System.out.println("Array after " + d + " left rotations: ");
        printArray(arr);
    }
    
    // Function to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
