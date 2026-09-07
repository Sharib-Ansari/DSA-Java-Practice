//class Average_array {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        float sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//
//        }
//        sum = sum / arr.length;
//        System.out.print(sum);
//    }
//}

import java.lang.reflect.Array;
import java.util.Arrays;

// sorting the array with two pointer
//class Average_array {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 5, 1, 4};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//
//                if(arr[j] > arr[i]){
//                    int tem = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tem;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//bubble sort
//class Average_array {
//    public static void main(String[] args) {
//
//        int[] arr = {5, 3, 4, 1, 2};
//
//        for(int i = 0; i < arr.length - 1; i++) {
//
//            for(int j = 0; j < arr.length - 1 - i; j++) {
//
//                if(arr[j] > arr[j + 1]) {
//
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}


// Subarray with given sum

//        int[] arr = {1, 4, 20, 3, 10, 5};
//        int target = 33;
//
//        int sum = 0;
//        int start = 0;
//
//for (int end = 0; end < arr.length; end++) {
//
//        sum = sum + arr[end];
//
//        while (sum > target) {
//        sum = sum - arr[start];
//        start++;
//        }
//
//        if (sum == target) {
//        System.out.println("Subarray found");
//
//            for (int i = start; i <= end; i++) {
//           System.out.print(arr[i] + " ");
//           }
//
//             break;
//         }
//     }


//longest subarray where the difference between consecutive elements is 0 or 1
 class Average_array {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 5, 6, 7};

        int count = 1;
        int max = 1;

        int start = 0;
        int bestStart = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i - 1] == 0 ||
                    arr[i] - arr[i - 1] == 1) {

                count++;

            } else {
                count = 1;
                start = i;
            }

            if (count > max) {
                max = count;
                bestStart = start;
            }
        }

        System.out.println("Longest length = " + max);

        System.out.print("Subarray = ");

        for (int i = bestStart; i < bestStart + max; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}