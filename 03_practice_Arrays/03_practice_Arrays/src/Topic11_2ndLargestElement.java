public class Topic11_2ndLargestElement {

    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 80, 60};

        int largest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];
                index = i;

            }
            else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            }
            else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest + " " +"index " + index);
        System.out.println("Second Largest = " + secondLargest);
        System.out.println("third Largest = " + thirdLargest);
    }
}

//even shorter way
//public class Topic11_2ndLargestElement {
//
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 50, 80, 60,10,20};
//
//        int largest = arr[0];
//        int secondLargest = arr[0];
//
//     for (int i = 1; i < arr.length; i++) {
//
//        if (arr[i] > largest) {
//            secondLargest = largest;
//            largest = arr[i];
//        } else if (arr[i] > secondLargest && arr[i] != largest) {
//            secondLargest = arr[i];
//        }
//
//     }
//
//        System.out.println("Largest = " + largest);
//        System.out.println("Second Largest = " + secondLargest);
//    }
//}

