//import java.util.Arrays;
//
//public class topic1_removeDuplicate {
//    //without using a new array
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 20, 30, 30, 30, 40};

//        System.out.print(arr[0]);
//
//        for (int i = 1; i < arr.length; i++) {
//
//            if(arr[i] != arr[i - 1]){
//                System.out.print(arr[i] + " ");
//            }
//
//        }
//    }
//}


import java.util.Arrays;
//
////with using a new array
//public class topic1_removeDuplicate{
//    public static void main(String[] args) {
//       int[] arr = {10, 20, 20, 30, 30, 30, 40};
//       int[] newArray = new int[arr.length];
//
//       //copy the first element
//        newArray[0] = arr[0];
//        int j = 1;
//
//        for (int i = 1; i <arr.length ; i++) {
//            if(arr[i] != arr[i -1]){
//                newArray[j] = arr[i];
//                j++;
//            }
//        }
//
//        System.out.println(Arrays.toString(newArray));
//        // o/p [10, 20, 30, 40, 0, 0, 0] if we use this to print element
//
//        for (int i = 0; i < j; i++) {
//            System.out.print(newArray[i] + " ");
//        }// o/p 10 20 30 40 more clean wayy
//
//    }
//}

    
// by using the two pointer method
public class topic1_removeDuplicate {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        int i = 1;

        for (int j = 1; j < arr.length; j++) {

            if(arr[j] != arr[i - 1]){
                arr[i] = arr[j];
                i++;
            }
        }
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}