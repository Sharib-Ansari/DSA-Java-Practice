//public class topic7_setOperations {
//    //intersection of two arrays or common element b/t two arrays
//    public static void main(String[] args) {
//
//        int[] arr1 = {10, 20, 30, 40};
//        int[] arr2 = {30, 40, 50, 60};
//
//        int[] result = new int[arr1.length];
//        int k = 0;
//
//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int j = 0; j < arr2.length; j++) {
//
//                if (arr1[i] == arr2[j]) {
//                    result[k] = arr1[i];
//                    k++;
//                    break;
//                }
//            }
//        }
//
//        for (int i = 0; i < k; i++) {
//            System.out.print(result[i] + " ");
//        }
//    }
//}

//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
////union of two arrays
//public class topic7_setOperations {
//    public static void main(String[] args) {
//
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {3, 4, 5, 6};
//
//        int[] result = new int[arr1.length + arr2.length];
//
//        int k = 0;
//
//        // Put elements of arr1 into result
//        for (int i = 0; i < arr1.length; i++) {
//            result[k] = arr1[i];
//            k++;
//        }
//
//        // Put arr2 elements only if they are not already present
//        for (int i = 0; i < arr2.length; i++) {
//
//            boolean alreadyPresent = false;
//
//            for (int j = 0; j < k; j++) {
//
//                if (arr2[i] == result[j]) {
//                    alreadyPresent = true;
//                    break;
//                }
//            }
//
//            if (!alreadyPresent) {
//                result[k] = arr2[i];
//                k++;
//            }
//        }
//        System.out.println(Arrays.toString(result));
//        //o/p [1, 2, 3, 4, 5, 6, 0, 0]
//
//
//        // Print only valid elements
//        for (int i = 0; i < k; i++) {
//            System.out.print(result[i] + " ");
//        }// o/p 1 2 3 4 5 6
//    }
//}



//difference of two arrays
public class topic7_setOperations {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] result = new int[arr1.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found)// found == false
                 {
                result[k] = arr1[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
    }
} // o/p 1 2