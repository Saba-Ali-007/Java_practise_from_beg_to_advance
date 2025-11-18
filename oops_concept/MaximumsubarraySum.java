package oops_concept;

public class MaximumsubarraySum {

    public static int maxSubArray(int[] nums) {
        int maximumSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maximumSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(arr);
        System.out.println("Maximum sum of subarray is: " + result);
    }
}
