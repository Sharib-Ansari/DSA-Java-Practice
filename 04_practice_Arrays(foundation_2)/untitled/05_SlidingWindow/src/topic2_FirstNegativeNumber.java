import java.util.Arrays;

public class topic2_FirstNegativeNumber {
    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        int[] copy = new int[arr.length-k+1];

        int x = 0;

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0){
                copy[x] = arr[i];
                x++;
                break;
            }
        }
        for (int i = k; i < arr.length; i++) {

            for (int j = i - k + 1; j <= i; j++) {
                if(arr[j] < 0){
                    copy[x] = arr[j];
                    x++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(copy));
    }
}
