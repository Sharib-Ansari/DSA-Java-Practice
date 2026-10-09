/*
First Negative Number in Every Window
Pattern: Fixed-Size Sliding Window
Logic:
1. k = size of each window.
2. Outer loop i selects the starting index of each window.
3. Inner loop j searches for the first negative number.
4. firstNegative = 0 means no negative number was found.
5. break stops searching once the first negative is found.
6. Store the answer in result[i].
Important formula:
\[
\text{Number of windows}=n-k+1
\]

For n = 8 and k = 3:
i <= n - k
i <= 8 - 3
i <= 5

i = 0, 1, 2, 3, 4, 5
Total windows = 6
 */
import java.util.Arrays;
public class topic5_FirstNegativeNumber {

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int n = arr.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {

            int firstNegative = 0;

            for (int j = i; j < i + k; j++) {

                if (arr[j] < 0) {
                    firstNegative = arr[j];
                    break;
                }
            }

            result[i] = firstNegative;
        }

        System.out.println("First Negative Number in Every Window:");
        System.out.println(Arrays.toString(result));
    }
}
