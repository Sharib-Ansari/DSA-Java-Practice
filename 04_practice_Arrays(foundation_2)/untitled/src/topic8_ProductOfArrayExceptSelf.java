import java.util.Arrays;

// arr = {1, 2, 3, 4}
//Let's see it manually 🧠
//For 1
//
//Don't include 1.
//
//Multiply everything else:
//
//        2 × 3 × 4 = 24
//
//So:
//
//result[0] = 24
//For 2
//
//Don't include 2.
//
//        1 × 3 × 4 = 12
//
//So:
//
//result[1] = 12
//For 3
//
//Don't include 3.
//
//        1 × 2 × 4 = 8
//
//So:
//
//result[2] = 8
//For 4
//
//Don't include 4.
//
//        1 × 2 × 3 = 6
//
//So:
//
//result[3] = 6
//        🎉 Final answer
//Input:
//
//        [1, 2, 3, 4]
//Output:
//
//        [24, 12, 8, 6]

public class topic8_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      int[] FinalArray = new int[arr.length];

      int k = 0;
      //int multiply = 1; if i create mul here it not start by one it start by the value that nested loop generate
      //so we start it creating inside in the for loop

        for (int i = 0; i < arr.length; i++) {

            int multiply = 1;

            for (int j = 0; j < arr.length; j++) {

                if(arr[i] != arr[j]) {
                    multiply = multiply * arr[j];
                }
            }

            FinalArray[k] = multiply;
            k++;
        }
        System.out.println(Arrays.toString(FinalArray));
    }
}

