//import java.util.Arrays;

//public class topic11_RemoveTargetedElementByTwoPointer {
//    public static void main(String[] args) {
//        int[] arr = {3, 2, 2, 3};
//        int target = 3;
//
//        int slow = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if(arr[i] != target){
//                arr[slow] = arr[i];
//                slow++;
//            }
//        }
//        for (int i = 0; i < slow; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        // o/p 2 2
//    }
//}



//🧠 First, what are we trying to do?
//
//        Our array is: [10, 20, 20, 30, 30, 30, 40]
//
//        Rule:
//
//        A number can appear at MOST 2 times.
//
//        So we want:
//
//        [10, 20, 20, 30, 30, 40]
//
//        The third 30 ❌ has to go.

////slow and fast pointer here fast pointer is i
public class topic11_RemoveTargetedElementByTwoPointer {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        int i = 2;

        for (int j = 2; j < arr.length; j++) {

            if(arr[j] != arr[i - 2]){
                arr[i] = arr[j];
                i++;
            }
        }
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
        // o/p 10 20 20 30 30 40
    }
}

