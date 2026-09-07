public class Topic10_min_arr {
    public static void main(String[] args) {
        int [] arr = {10, 30, 50, 80,};
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]){
                min = arr[i];

            }

        }
        System.out.println(min + " , ");
    }
}
