public class topic5_findingMaxValue {
    public static void main(String[] args) {
         int[] arr = {1, 24, 65, 23, 80, 77, 86};
        System.out.println(max(arr, 1, 3));
    }
//    static int max (int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

    //similarly we can find max num between the range we give
    static int max (int[] arr, int start, int end) {
        int maxVal = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
