import java.util.Arrays;
public class BinarySearch2 {
    public static int binarySearch(int[] arr, int low,int high,int target){
        if(high < low) return -1;
        int mid = low + (high - low) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return binarySearch(arr,mid+1,high,target);
        return binarySearch(arr,low,mid-1,target);
    }
    public static void main(String[] args){
        int[] arr = { 2, 4, 5, 1, 3, 6, 7 };
        int target = 5;
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        int result = binarySearch(arr,low,high,target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
