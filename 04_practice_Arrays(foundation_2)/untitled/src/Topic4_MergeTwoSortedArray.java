import java.util.Arrays;


public class Topic4_MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};// i
        int[] arr2 = {2, 4, 6, 8};// j

        int[] finalArray = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                finalArray[k] = arr1[i];
                i++;
            } else {
                finalArray[k] = arr2[j];
                j++;
            }

            k++;
        }

        // Copy remaining arr1 elements
        while (i < arr1.length) {
            finalArray[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining arr2 elements
        while (j < arr2.length) {
            finalArray[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(finalArray));
    }
}


////without using extra space (or array)
//public class Topic4_MergeTwoSortedArray {
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 3, 5, 7};// i
//        int[] arr2 = {2, 4, 6, 8};// j
//
//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int j = 0; j < arr2.length ; j++) {
//
//                if (arr1[i] > arr2[j]) {
//
//                    int temp = arr1[i];
//                    arr1[i] = arr2[j];
//                    arr2[j] = temp;
//                }
//            }
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//    }
//}
