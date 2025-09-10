import java.util.Scanner;

public class Max_min {

    public static int[] maxMin(int arr[], int indx, int j) {
        if (indx == j) {
            // Only one element
            return new int[] {arr[indx], arr[indx]}; // {max, min}
        }

        if ((j - indx) == 1) {
            // Two elements
            if (arr[indx] > arr[j]) {
                return new int[] {arr[indx], arr[j]}; // max, min
            } else {
                return new int[] {arr[j], arr[indx]};
            }
        }

        int mid = (indx + j) / 2;

        int[] left = maxMin(arr, indx, mid);    // {max, min}
        int[] right = maxMin(arr, mid + 1, j); // {max, min}

        int overallMax = (left[0] > right[0]) ? left[0] : right[0];
        int overallMin = (left[1] < right[1]) ? left[1] : right[1];

        return new int[] {overallMax, overallMin};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = maxMin(arr, 0, n - 1);

        System.out.println("Max is " + ans[0]);
        System.out.println("Min is " + ans[1]);

        sc.close();
    }
}
