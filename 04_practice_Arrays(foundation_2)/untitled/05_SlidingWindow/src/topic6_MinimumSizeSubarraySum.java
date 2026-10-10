/*2. Understand the Logic

Our input is:

arr = [2, 3, 1, 2, 4, 3]
target = 7

We need the shortest continuous subarray whose sum is at least 7.

For example:

        [2, 3, 1, 2] → Sum = 8, Length = 4
        [1, 2, 4]    → Sum = 7, Length = 3
        [4, 3]       → Sum = 7, Length = 2

All three subarrays satisfy the condition, but [4, 3] is the shortest. Therefore, our answer is 2.

The code uses two loops to examine subarrays. The outer loop (i) chooses the starting index, while the inner loop (j) extends the subarray towards the right.

3. Important Variables

target = 7

This is the minimum sum required. A subarray is valid when sum >= target.

        sum = 0

This variable calculates the sum of the current subarray. It is initialized inside the outer loop because every new starting index requires a fresh sum.

sum += arr[j];

This is shorthand for:

sum = sum + arr[j];

        For example, when the starting index is 0, the sum grows like this:

Add 2 → sum = 2
Add 3 → sum = 5
Add 1 → sum = 6
Add 2 → sum = 8

Now sum >= target, because 8 >= 7.

minLength = arr.length + 1

Our array contains six elements, so:

minLength = 6 + 1 = 7

Seven is a temporary starting value, not the answer. No subarray of this array can have length seven, so any valid answer will be smaller than it.

Whenever a shorter valid subarray is found, minLength is updated.

        length = j - i + 1

This formula calculates the number of elements in the current subarray.

i is the starting index.

j is the ending index.

+1 is necessary because both indexes are included.

For the subarray [4, 3], the indexes are 4 and 5.

length = j - i + 1
        = 5 - 4 + 1
        = 2

Therefore, the subarray contains two elements.

4. Why Do We Use break?

        if (sum >= target) {

int length = j - i + 1;

    if (length < minLength) {
minLength = length;
    }

            break;
            }

Once the sum reaches the target for a particular starting index, we record its length and stop checking that starting position.

Why? Because all numbers in this problem are positive. Adding more elements can only increase the sum and the length; it cannot produce a shorter valid subarray for that same starting index.

The break stops only the inner loop. The outer loop continues to examine other starting positions, because a shorter subarray might begin elsewhere.

5. Why Do We Check minLength at the End?

        if (minLength == arr.length + 1) {
        System.out.println(0);
} else {
        System.out.println("Minimum Length: " + minLength);
}

If minLength still equals arr.length + 1, no valid subarray was ever found. In that case, we print 0.

For example, if target = 20, the array's total sum is only 15. No subarray can reach 20, so the result would be 0.

*/
public class topic6_MinimumSizeSubarraySum {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minLength = arr.length + 1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum >= target){
                    int length = j - i + 1;

                    if(length < minLength){
                        minLength = length;
                    }
                    break;
                }
            }
        }
        if (minLength == arr.length + 1) {
            System.out.println(0);
        } else {
            System.out.println("Minimum Length: " + minLength);
        }
    }
}
