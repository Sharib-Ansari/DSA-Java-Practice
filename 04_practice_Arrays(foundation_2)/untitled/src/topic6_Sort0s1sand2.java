import java.util.Arrays;
//
//public class topic6_Sort0s1sand2 {
//    public static void main(String[] args) {
//        int[] arr = {2, 0, 1, 2, 1, 0};
//
//        int[] zeroArray = new int[arr.length];
//        int[] onesArray = new int[arr.length];
//        int[] twosArray = new int[arr.length];
//        int[] result = new int[arr.length];
//
//        int k = 0;
//        int j = 0;
//        int l = 0;
//        int x = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i] == 0){
//                zeroArray[k] = arr[i];
//                k++;
//            }
//            else if (arr[i] == 1) {
//                onesArray[j] = arr[i];
//                j++;
//            }
//            else {
//                twosArray[l] = arr[i];
//                l++;
//            }
//        }
//
//        System.out.println(Arrays.toString(zeroArray));
//        System.out.println(Arrays.toString(onesArray));
//        System.out.println(Arrays.toString(twosArray));
//
////        [0, 0, 0, 0, 0, 0]
////        [1, 1, 0, 0, 0, 0]
////        [2, 2, 0, 0, 0, 0]
//
//
//        // Put all 0s first
//        for (int i = 0; i < k; i++) {
//            result[x] = zeroArray[i];
//            x++;
//        }
//
//        // Put all 1s next
//        for (int i = 0; i < j; i++) {
//            result[x] = onesArray[i];
//            x++;
//        }
//
//        // Put all 2s last
//        for (int i = 0; i < l; i++) {
//            result[x] = twosArray[i];
//            x++;
//        }
//
//        System.out.println(Arrays.toString(result));
//    }
//}
//
//
//// now this time we do this using 3 pointers (Dutch national flag) problem


public class topic6_Sort0s1sand2 {

    public static void main(String[] args) {

        int[] arr = {2, 0, 1, 2, 1, 0, 0, 1, 2, 2, 1};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

       while (mid <= high){

           if (arr[mid] == 0){
              int tem = arr[low];
              arr[low] = arr[mid];
              arr[mid] = tem;

              low++;
              mid++;
           }

           else if (arr[mid] == 1 ) {
               mid++;
           }

           else {
               int temp = arr[mid];
               arr[mid] = arr[high];
               arr[high] = temp;

               high--;
           }
       }

        System.out.println(Arrays.toString(arr));
    }
}