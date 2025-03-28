import java.util.Arrays;

public class LowerBound {
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        int ans = -1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                high = mid;
                ans = mid;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // instead of the answer variable you can keep
    // public static int lowerBound(int[] arr, int target) {
    // int low = 0, high = arr.length; // high = arr.length (not arr.length - 1)

    // while (low < high) { // Correct loop condition
    // int mid = low + (high - low) / 2;

    // if (arr[mid] >= target) {
    // high = mid; // Shrink high to mid, not mid - 1
    // } else {
    // low = mid + 1;
    // }
    // }

    // return low; // Low is the final lower bound index
    // }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 1, 3, 6, 7 };
        int target = 5;
        Arrays.sort(arr);
        int result = lowerBound(arr, target);
        if (result != -1) {
            System.out.println("Lower Bound of " + target + " is at index: " + result);
        } else {
            System.out.println("Target not found — Lower Bound would be at index: " + result);
        }
    }
}