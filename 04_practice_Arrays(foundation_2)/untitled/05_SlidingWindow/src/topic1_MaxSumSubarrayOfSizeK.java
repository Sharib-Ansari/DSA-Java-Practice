public class topic1_MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];

            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum sum = " + maxSum);

    }
}
