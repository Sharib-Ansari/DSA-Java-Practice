//public class Topic21_DuplicateNumber {
//    public static void main(String[] args) {
//       int[] arr = {110, 20, 90, 20, 10, 100};
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            for (int j = i+1; j <arr.length ; j++) {
//
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    return;
//                }
//            }
//
//        }
//
//    }
//}

////Print all duplicate elements
//public class Topic21_DuplicateNumber {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 20, 10, 30};
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            for (int j = i+1; j <arr.length ; j++) {
//
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//
//        }
//
//    }
//}

////first duplicate element
//public class Topic21_DuplicateNumber {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 20, 10, 30};
//
//        for (int i = 0; i <arr.length ; i++) {
//
//             {//this is called backward algorithm
//
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                    return;
//                }
//            }
//
//        }
//
//    }
//}


//find frequency of duplicate
public class Topic21_DuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 30, 30};

        for (int i = 0; i < arr.length; i++) {

            // Skip if this number has already appeared before
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {//if true
                continue;//Skip everything below me and jump to the next value of i
            }

            int frequency = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    frequency++;
                }

            }

            if (frequency > 1) {
                System.out.println(arr[i] + " -> " + frequency);
            }

        }

    }
}

