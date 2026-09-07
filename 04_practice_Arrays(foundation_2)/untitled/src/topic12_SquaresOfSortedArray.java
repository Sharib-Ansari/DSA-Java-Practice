import java.lang.reflect.Array;
import java.util.Arrays;
//
//public class topic12_SquaresOfSortedArray {
//    public static void main(String[] args) {
//
//        int[] arr = {-4, -1, 0, 3, 10};
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * arr[i];
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//without using the inbuilt method
public class topic12_SquaresOfSortedArray{
    public static void main(String[] args) {

        int[] arr = {-4, -1, 0, 3, 10};

        int[] result = new int[arr.length];
        int k = arr.length-1;

        int left = 0;
        int right = arr.length-1;


        while (left <= right) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {

                result[k] = arr[left] * arr[left];
                left++;

            } else {

                result[k] = arr[right] * arr[right];
                right--;
            }

            k--;
        }
        System.out.println(Arrays.toString(result));
    }
}
