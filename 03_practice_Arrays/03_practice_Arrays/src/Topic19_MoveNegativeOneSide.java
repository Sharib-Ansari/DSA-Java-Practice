//import java.util.Arrays;
//
//public class Topic19_MoveNegativeOneSide {
///// this is by creating new array
//    public static void main(String[] args) {
//
//        int[] arr = {10, -5, 20, -8, 30, -2};
//
//        int[] result = new int[arr.length];
//        int index = 0;
//
//        // Copy all negative numbers first
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                result[index] = arr[i];
//                index++;
//            }
//        }
//
//        // Copy all positive numbers
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] >= 0) {
//                result[index] = arr[i];
//                index++;
//            }
//        }
//
//        System.out.println(Arrays.toString(result));
//    }
//}


///this is by changing existing array

import java.util.Arrays;

public class Topic19_MoveNegativeOneSide {

    public static void main(String[] args) {

        int[] arr = {10, -5, 20, -8, 30, -2};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] < 0) {
                left++;
            }

            while (left < right && arr[right] >= 0) {
                right--;
            }

            if (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}