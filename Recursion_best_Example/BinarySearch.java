public class BinarySearch {
    public static int binarySearch(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1; // Target not found
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, end); // Search in the right half
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
}
