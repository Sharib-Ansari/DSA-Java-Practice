/*
 * LONGEST MOUNTAIN IN ARRAY
 *
 * Question:
 * Find the longest part of an array that:
 * 1. Strictly increases
 * 2. Has a PEAK
 * 3. Strictly decreases
 *
 * Example:
 * [2, 1, 4, 7, 3, 2, 5]
 *
 * Mountain:
 * [1, 4, 7, 3, 2]
 *
 * Answer = 5
 *
 * Approach:
 * 1. Check every middle element as a possible PEAK.
 *
 * 2. Peak condition:
 *      arr[i] > arr[i-1]
 *      &&
 *      arr[i] > arr[i+1]
 *
 * 3. If peak is found:
 *      Start LEFT from peak.
 *      Move left while numbers are increasing.
 *
 * 4. Start RIGHT from peak.
 *      Move right while numbers are decreasing.
 *
 * 5. Calculate current mountain length:
 *      right - left + 1
 *
 *      +1 because both LEFT and RIGHT
 *      indexes are included.
 *
 * 6. Compare current mountain length
 *    with longest found so far.
 *
 * 7. Store the bigger length.
 *
 * MEMORY:
 *
 *              PEAK
 *             /    \
 *            /      \
 *         LEFT      RIGHT
 *
 * Find PEAK
 *    ↓
 * Expand LEFT
 *    ↓
 * Expand RIGHT
 *    ↓
 * Count length
 *    ↓
 * Keep MAX
 *
 * IMPORTANT:
 * right - left     = distance
 * right - left + 1 = number of elements
 *
 * Time: O(n²) worst case
 * Space: O(1)
 */
public class topic18_LongestMountainInArray {
    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 7, 3, 2, 5};

        int longestMountain = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak = " + arr[i]);

                int left = i;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                System.out.println("Mountain starts at index = " + left);

                int right = i;
                while (right < arr.length-1 && arr[right] > arr[right + 1]){
                    right++;
                }
                System.out.println("Mountain ends at index = " + right);

                int currentMountainLength = right - left + 1;

                if(currentMountainLength > longestMountain){
                    longestMountain = currentMountainLength;
                }
            }
        }
        System.out.println("Longest Mountain Length = " + longestMountain);

    }
}