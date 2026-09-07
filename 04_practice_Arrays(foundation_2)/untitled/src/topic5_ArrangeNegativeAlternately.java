import java.util.Arrays;

public class topic5_ArrangeNegativeAlternately {
    public static void main(String[] args) {
       int[] arr = {1, 2, -3, -4, 5, -6};

       int[] PositiveArray = new int[arr.length];
       int[] NegativeArray = new int[arr.length];
       int[] result = new int[arr.length];

       int k = 0;
       int j = 0;
       int x = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] < 0){
                NegativeArray[k] = arr[i];
                k++;
            }
            else {
                PositiveArray[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(PositiveArray));
        System.out.println(Arrays.toString(NegativeArray));

        // o/p [1, 2, 5, 0, 0, 0]
        //     [-3, -4, -6, 0, 0, 0]

        for (int i = 0; i < j; i++) {
            //here the value of j is 3

            result[x] = PositiveArray[i];
            x++;

            result[x] = NegativeArray[i];
            x++;
        }
        System.out.println(Arrays.toString(result));
        // o/p [1, -3, 2, -4, 5, -6]
    }
}
