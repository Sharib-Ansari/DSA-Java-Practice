/*
 * TRAPPING RAIN WATER
 *
 * Question:
 * Find the total amount of water that can be trapped
 * between the bars of the array.
 *
 * Example:
 * [3, 0, 2, 0, 4]
 *
 * Water trapped = 7
 *
 * Core Idea:
 * Water at a position depends on the shorter wall
 * on its left and right.
 *
 * Water = min(leftMax, rightMax) - arr[i]
 *
 * Two Pointer Approach:
 *
 * 1. Start:
 *      left = 0
 *      right = arr.length - 1
 *
 * 2. Keep:
 *      leftMax  = tallest wall seen from LEFT
 *      rightMax = tallest wall seen from RIGHT
 *
 * 3. Compare:
 *      arr[left] and arr[right]
 *
 * 4. If left side is smaller:
 *      Process LEFT
 *
 *      If arr[left] >= leftMax:
 *          update leftMax
 *
 *      Else:
 *          water += leftMax - arr[left]
 *
 *      Move:
 *          left++
 *
 * 5. Otherwise:
 *      Process RIGHT
 *
 *      If arr[right] >= rightMax:
 *          update rightMax
 *
 *      Else:
 *          water += rightMax - arr[right]
 *
 *      Move:
 *          right--
 *
 * 6. Continue until:
 *      left >= right
 *
 * 7. Final answer = total water
 *
 * MEMORY:
 *
 * left →                 ← right
 *        TWO POINTERS
 *
 * Smaller boundary
 *       ↓
 * Process that side
 *       ↓
 * Update MAX / Add WATER
 *       ↓
 * Move pointer
 *
 * Key Idea:
 * SHORTER WALL controls the water level.
 *
 * Time: O(n)
 * Space: O(1)
 */
public class topic19_TrappingRainWater {
    public static void main(String[] args) {

        int[] arr = {3, 0, 2, 0, 4};

        // Two pointers
        int left = 0;
        int right = arr.length - 1;

        // Store the tallest wall seen from each side
        int leftMax = 0;
        int rightMax = 0;

        // Total trapped water
        int water = 0;

        // Process the array using two pointers
        while (left < right) {

            // Process the side with the smaller boundary
            if (arr[left] < arr[right]) {

                // Update left maximum or collect water
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }

                // Move left pointer
                left++;

            } else {

                // Update right maximum or collect water
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }

                // Move right pointer
                right--;
            }
        }

        System.out.println("Total trapped water = " + water);
    }
}
