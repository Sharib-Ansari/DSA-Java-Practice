//import java.util.Arrays;
////// this is type 1 only elements are manipulated but the original is same
//public class Topic16_reversingArray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
//
//    }
//}

//import java.util.Arrays;
//// this is type 2 we use another array to manipulation but the original array is same
//public class Topic16_reversingArray {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] reverse = new int[arr.length];
//        int j = 0;
//
//        for (int i = arr.length-1; i >= 0 ; i--) {
//            reverse[j] = arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(reverse));
//    }
//}


import java.util.Arrays;
// this is type 3 we manipulate the original array (by two pointer)
public class Topic16_reversingArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }
}


