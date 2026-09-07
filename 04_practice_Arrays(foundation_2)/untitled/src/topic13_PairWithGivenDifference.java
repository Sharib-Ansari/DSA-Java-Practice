import java.util.Arrays;

public class topic13_PairWithGivenDifference {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int difference = 2;

        Arrays.sort(arr);

        int left = 0;
        int right = 1;

        while (right <= arr.length){
            int diff = arr[right] - arr[left];

            if (diff == difference){

                System.out.println("Pair is: "
                        + arr[left] + " and " + arr[right]);
                left++;
                right++;
            }
            else if (diff < difference) {
                right++;
            }
            else {
                left++;
            }
            if (left == right) {
                right++;
            }
        }
    }
}

