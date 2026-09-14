/*
 * THREE SUM CLOSEST
 *
 * Question:
 * Find 3 numbers whose sum is closest to target.
 *
 * Approach:
 * 1. Sort the array.
 * 2. Fix one number using i.
 * 3. left = i + 1
 *    right = last index
 * 4. sum = fixed + arr[left] + arr[right]
 * 5. Compare how close sum is to target:
 *      |sum - target|
 *      Smaller difference = better answer.
 * 6. If current sum is closer:
 *      bestClosest = sum
 * 7. Pointer movement:
 *      sum < target → left++
 *      sum > target → right--
 *      sum == target → exact answer, stop.
 *
 * MEMORY:
 * Three Sum + keep the sum closest to target.
 */
import java.util.Arrays;
public class topic16_ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int target = 1;

        Arrays.sort(arr);

        int bestClosest = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++) {

            int fixedNum = arr[i];

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = fixedNum + arr[left] + arr[right];

                // Check whether current sum is closer to target
                if (Math.abs(sum - target) < Math.abs(bestClosest - target)) {
                    bestClosest = sum;
                }

                // Exact target found
                if (sum == target) {
                    break;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        System.out.println("Closest sum = " + bestClosest);
    }

}
