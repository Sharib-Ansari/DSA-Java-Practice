public class topic4_LongestContinuousIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 7, 8, 9, 2};

        int maxContinuous = 1;
        int currentContinuous = 1;

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] < arr[i + 1]){
                currentContinuous++;

                if (currentContinuous > maxContinuous){
                    maxContinuous = currentContinuous;
                }
            }
            else {
                currentContinuous = 1;
            }

        }
        System.out.println(maxContinuous);

    }
}
