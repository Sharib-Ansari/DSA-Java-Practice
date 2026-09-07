//public class Topic12_2nd_smallestElement {
//    public static void main(String[] args) {
//       int [] arr = {13, 40, 12, 45, 80, 20};
//
//       int smallest = arr[0];
//       int secondSmallest = arr[0];
//       int thirdSmallest = arr[0];
//
//        for (int i = 1; i < arr.length ; i++) {
//            if ( smallest > arr[i] ) {
//                thirdSmallest = secondSmallest;
//                secondSmallest = smallest;
//                smallest = arr[i];
//            }
//            else if (arr[i] < secondSmallest) {
//                thirdSmallest = secondSmallest;
//                secondSmallest = arr[i];
//            }
//            else if (arr[i] < thirdSmallest) {
//                thirdSmallest = arr[i];
//            }
//        }
//        System.out.println("1st smallest " + smallest);
//        System.out.println("2nd smallest " + secondSmallest);
//        System.out.println("3rd smallest0 " + thirdSmallest);
//
//    }
//}

public class Topic12_2nd_smallestElement {
    public static void main(String[] args) {
        int[] arr = {13, 40, 12, 45, 80, 20};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int thirdSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {

                thirdSmallest = secondSmallest;
                secondSmallest = smallest;
                smallest = arr[i];

            }
            else if (arr[i] < secondSmallest) {

                thirdSmallest = secondSmallest;
                secondSmallest = arr[i];

            }
            else if (arr[i] < thirdSmallest) {

                thirdSmallest = arr[i];

            }

        }
        System.out.println("1st smallest " + smallest);
        System.out.println("2nd smallest " + secondSmallest);
        System.out.println("3rd smallest0 " + thirdSmallest);

    }
}

