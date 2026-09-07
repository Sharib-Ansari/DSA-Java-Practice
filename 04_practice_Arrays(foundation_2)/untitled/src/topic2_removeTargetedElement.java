//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class topic2_removeTargetedElement {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 30, 20, 40};
//        int target = 20;
//
//        int[] newArray = new int[arr.length];
//        int j = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                continue;
//
//            }
//
//            newArray[j] = arr[i];
//            j++;
//
//        }
//        for (int i = 0; i < j; i++) {
//            System.out.print(newArray[i] + " ");
//        }
//
//    }
//}


//

//public class topic2_removeTargetedElement {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 30, 20, 40};
//        int target = 20;
//
//        int[] newArray = new int[arr.length];
//        int j = 0; 1
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i] != target){
//                arr[j] = arr[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < j; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}


import java.util.Arrays;

////remove it by using the two pointer method
public class topic2_removeTargetedElement {
    public static void main(String[] args) {

        int[] arr = {10, 0, 20, 0, 30, 0, 40, 50};
        int target = 0;

        int[] newArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == target){
                newArray[j] = arr[i];
                j++;
            }
        }
// Copy all non_zeros numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArray[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}

