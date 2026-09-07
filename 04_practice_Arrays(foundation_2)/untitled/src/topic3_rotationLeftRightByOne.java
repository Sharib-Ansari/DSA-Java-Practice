//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class topic3_rotationLeftRightByOne {
//
//    // left rotation
//    public static void main(String[] args) {
//
//        int[] arr = {8, 6, 7, 9};
//
//        int temp = arr[0];
//
//        for (int i = 0; i < arr.length-1; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        arr[arr.length-1] = temp;
//        System.out.println(Arrays.toString(arr)); // o/p [6, 7, 9, 8]
//    }
//}

//import java.util.Arrays;
//// right rotation
//public class topic3_rotationLeftRightByOne{
//    public static void main(String[] args) {
//        int[] arr = {8, 6, 7, 9};
//
//        int temp = arr[3];
//
//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//       }
//        arr[0] = temp;
//        System.out.println(Arrays.toString(arr));
//    }
//} // o/p [9, 8, 6, 7]


//import java.util.Arrays;
//
//public class topic3_rotationLeftRightByOne {
//
//    // left rotation
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, 4, 5, 6};
//
//        int k = 3;
//
//        for (int count = 1; count <= k; count++) {
//
//            int temp = arr[0];
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//
//            arr[arr.length - 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}


// by using the reverse method
import java.util.Arrays;

public class topic3_rotationLeftRightByOne {

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int k = 3;

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, arr.length - 1);

        // Reverse the whole array
        reverse(arr, 0, arr.length - 1);

        System.out.print("final array is  ");
        System.out.print(Arrays.toString(arr));
    }


}