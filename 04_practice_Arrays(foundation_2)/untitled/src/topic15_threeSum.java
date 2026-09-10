/*
 * THREE SUM
 *
 * Question:
 * Find THREE numbers whose sum is 0.
 *
 * Example:
 * [-1, 0, 1, 2, -1, -4]
 * Answer:
 * [-1, -1, 2]
 * [-1,  0, 1]
 *
 * Approach:
 * 1. Sort the array.
 * 2. Use i to FIX one number.
 * 3. left = i + 1, right = last index.
 * 4. Calculate:
 *      sum = fixed + arr[left] + arr[right]
 *
 * 5. If sum == 0:
 *      Found a triplet.
 * 6. If sum < 0:
 *      Need a bigger sum → left++
 * 7. If sum > 0:
 *      Need a smaller sum → right--
 *
 * IMPORTANT:
 * - i < arr.length - 2
 *   because TWO numbers must remain after fixed number.
 *
 * - Skip duplicates so the same triplet isn't repeated.
 *
 * MEMORY:
 * Three Sum = Fix ONE number + Two Pointer Two Sum.
 */
import java.util.Arrays;

public class topic15_threeSum {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);// o/p -4, -1, -1, 0, 1, 2

        int target = 0;

        for (int i = 1; i < arr.length-2; i++) {

            int fixedNumber = arr[i];
            int left = i + 1;
            int right = arr.length-1;

            while(left < right){

                int sum = fixedNumber + arr[left] + arr[right];

                if( sum == target){
                    System.out.println("num is "+
                            fixedNumber + " " +
                            arr[left] + " " +
                            arr[right]);
                    break;
                }
                else if (sum < target) {
                    left++;
                }
                else{
                    right--;

                }
            }
        }

    }
}
