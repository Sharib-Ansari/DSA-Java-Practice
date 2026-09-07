//public class Topic14_occurrenceOfElements {
//    public static void main(String[] args) {
//      int[] arr = {10, 10, 20, 30, 40, 10, 10};

//      int num = 10;
//      int occurrence = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//         if(arr[i] == num) {
//             occurrence += 1;
//         }
//        }
//        System.out.println(occurrence);
//    }
//}


//this will print the index of the repeated number

//public class Topic14_occurrenceOfElements {
//    public static void main(String[] args) {
//        int[] arr = {10, 10, 20, 30, 40, 10, 10};
//        //int[] org = arr;
//        int num = 10;
//        int occurrence = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] == num) {
//                System.out.println(i);
//            }
//        }
//
//    }
//}


//this will print the index of 1st repeated number

//public class Topic14_occurrenceOfElements {
//    public static void main(String[] args) {
//        int[] arr = {30, 15, 20, 30, 10, 10, 10};
//        //int[] org = arr;
//        int num = 10;
//        int occurrence = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if(arr[i] == num) {
//                System.out.println(i);
//                break;
//            }
//        }
//
//    }
//}


//this will print the index of last repeated number
//🌚
public class Topic14_occurrenceOfElements {
    public static void main(String[] args) {
        int[] arr = {30, 15, 20, 10, 10, 30, 10};

        int num = 10;
        int lastIndex = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == num) {
             lastIndex = i;

            }

        }
        System.out.println(lastIndex);

    }
}