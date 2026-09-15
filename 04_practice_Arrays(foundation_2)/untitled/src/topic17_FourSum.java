/*
 * FOUR SUM
 *
 * Question:
 * Find 4 numbers whose sum equals target.
 *
 * Example:
 * [-2, -1, 0, 0, 1, 2], target = 0
 *
 * Answers:
 * [-2, -1, 1, 2]
 * [-2,  0, 0, 2]
 * [-1,  0, 0, 1]
 *
 * Approach:
 * 1. Sort the array.
 * 2. Fix first number using i.
 * 3. Fix second number using j.
 * 4. left = j + 1
 *    right = last index
 * 5. Calculate:
 *      sum = nums[i] + nums[j] + nums[left] + nums[right]
 *
 * 6. If sum == target:
 *      Found quadruplet.
 *
 * 7. If sum < target:
 *      Need a bigger sum → left++
 *
 * 8. If sum > target:
 *      Need a smaller sum → right--
 *
 * IMPORTANT:
 * - i → first fixed number
 * - j → second fixed number
 * - left → third number
 * - right → fourth number
 * - Skip duplicates to avoid repeated quadruplets.
 *
 * MEMORY:
 * Four Sum = Fix TWO numbers + Two Pointer.
 *
 * Three Sum  = Fix ONE + Two Pointer
 * Four Sum   = Fix TWO + Two Pointer
 */
import java.util.Arrays;

public class topic17_FourSum {
    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        Arrays.sort(arr);//[-2, -1, 0, 0, 1, 2]

        for (int i = 0; i < arr.length-3; i++) {

            int fixed1 = arr[i];

            for (int j = i + 1; j < arr.length-2; j++) {
                int fixed2 = arr[j];

                int left = j + 1;
                int right = arr.length-1;

                while (left < right){

                    int sum = fixed1 + fixed2 + arr[left] + arr[right];

                    if(sum == target){
                        System.out.println("num is "+
                                fixed1 + " " +
                                fixed2 + " " +
                                arr[left] + " " +
                                arr[right]);
                        left ++;
                        right --;
                    } else if (sum < target) {
                        left ++;
                    }
                    else {
                        right --;
                    }
                }
            }

        }
    }
}
