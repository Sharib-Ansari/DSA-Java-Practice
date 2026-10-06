/*
 * MAXIMUM AVERAGE SUBARRAY
 * Remember:
 *
 * K fixed → WINDOW fixed
 *
 * 1. Take first K numbers
 *    → find SUM
 *
 * 2. Slide window:
 *    REMOVE the number leaving
 *    ADD the number entering
 *
 *    sum = sum - old + new
 *
 * 3. Keep the BIGGEST SUM
 *
 * 4. At the end:
 *    answer = biggestSum / K
 *
 *
 * EXAMPLE:
 * [1, 12, -5, -6, 50, 3]
 * K = 4
 *
 * [1,12,-5,-6] → 2
 * [12,-5,-6,50] → 51 ✅
 * [-5,-6,50,3] → 42
 *
 * biggestSum = 51
 *
 * answer = 51 / 4
 *        = 12.75
 *
 *
 * MEMORY:
 * FIRST K
 *   ↓
 * SUM
 *   ↓
 * SLIDE
 *   ↓
 * - OLD + NEW
 *   ↓
 * KEEP MAX
 *   ↓
 * MAX / K
 *
 * Time: O(n)
 * Space: O(1)
 */
public class topic3_MaxAverageSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        float sum = 0;
        float Maxsum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        Maxsum = sum;
        System.out.println(Maxsum);

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            if(sum > Maxsum){
                Maxsum = sum;
            }

        }
        float maxAverage = Maxsum / k;

        System.out.println("Maximum Average = " + maxAverage);

    }
}
