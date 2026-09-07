import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic15_copyArray {
    public static void main(String[] args) {
     int[] arr = {10, 20, 30, 40, 50};

     int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            copy[i] = arr[i];
        }
        System.out.print(Arrays.toString(copy));
    }
}
