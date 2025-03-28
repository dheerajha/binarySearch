import java.util.Arrays;

class BinarySearch {
    // Binary search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 3, 6, 7 };
        int target = 5;

        // Sort the array before binary search
        Arrays.sort(arr);

        // Call binary search
        int result = binarySearch(arr, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
