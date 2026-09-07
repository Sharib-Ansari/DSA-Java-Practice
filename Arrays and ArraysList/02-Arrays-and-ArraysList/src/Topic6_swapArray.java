import java.util.Arrays;

public class Topic6_swapArray {
// by two pointer method
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

//        swap(arr, 0, 3);

//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            //swap
            swap(arr, start, end);
            start++;
            end--;

        };
    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}

//import java.util.Arrays;
//
//public class ReverseArray {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,6,7};
//
//        reverse(arr);
//
//        System.out.println(Arrays.toString(arr));
//
//    }
//
//    static void reverse(int[] arr){
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while(left < right){
//
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//
//            left++;
//            right--;
//
//        }
//    }
//}
