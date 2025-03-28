import java.util.Arrays;

public class UpperBound {
    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    /*
     * public static int upperBound(int[] arr, int target) {
     * int low = 0, high = arr.length;
     * 
     * while (low < high) {
     * int mid = low + (high - low) / 2;
     * if (arr[mid] > target) {
     * high = mid; // Move high to mid (upper bound found)
     * } else {
     * low = mid + 1; // Keep searching for a larger element
     * }
     * }
     * 
     * return low; // Low holds the correct upper bound index
     * }
     * 
     */

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 3, 6, 7 };
        int target = 5;
        Arrays.sort(arr);
        int result = upperBound(arr, target);
        if (result != -1) {
            System.out.println("Upper Bound of " + target + " is at index: " + result);
        } else {
            System.out.println("Target not found — Upper Bound would be at index: " + result);
        }
    }
}