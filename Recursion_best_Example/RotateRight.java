public class RotateRight {

    // Helper function to reverse a portion of the array
 public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }

    // Rotate array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        k = k % n;                 // normalize if k >= n
        if (k < 0) k += n;         // optional: handle negative k

        reverse(arr, 0, n - 1);    // reverse whole array
        reverse(arr, 0, k - 1);    // reverse first k elements
        reverse(arr, k, n - 1);    // reverse rest
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        rotateRight(arr, k);
        for (int x : arr) System.out.print(x + " ");
    }
}
    

