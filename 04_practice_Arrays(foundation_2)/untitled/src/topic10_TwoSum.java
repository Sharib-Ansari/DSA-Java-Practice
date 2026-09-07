//public class topic10_TwoSum {
//    public static void main(String[] args) {
//      int[] arr = {2, 10, 11, 15, 7};
//
//      int target = 9;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length ; j++) {
//
//                if(arr[i] + arr[j] == target) {
//                    System.out.println(arr[i] + " index is: " +  i);
//                    System.out.println(arr[j] + " index is: " +  j);
//                    return;
//                }
//            }
//        }
//    }
//}

//optimized version for sorted array and unsorted array
import java.util.HashMap;

public class topic10_TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 19, 5, 11, 7};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {

                System.out.println("Indexes are: "
                        + map.get(needed) + " and " + i + " and " + needed + " " + arr[i]);

                return;
            }

            map.put(arr[i], i);
        }
    }
}

//// we can solve it by using the two pure two pointer method
////only for sorted array
//public class topic10_TwoSum{
//    public static void main(String[] args) {
//
//        int[] arr = {2, 7, 10, 11, 15};
//        int target = 9;
//
//        int left = 0;
//        int right = arr.length-1;
//
//
//        while(left < right) {
//
//            int sum = arr[left] + arr[right];
//
//            if(sum == target){
//
//                System.out.println("Pair is: " + arr[left] + " and " + arr[right]);
//                return;
//
//            } else if (sum < target) {
//
//                left++;
//            }else {
//
//                right--;
//            }
//        }
//    }
//}