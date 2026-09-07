public class Topic25_GreatestElementOnRightSide {
    public static void main(String[] args) {
       int[] arr = {16, 17, 4, 3, 5, 2};

        for (int i = 0; i < arr.length-1; i++) {
            int greatest = arr[i + 1];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > greatest){
                    greatest = arr[j];
                }
            }

            arr[i] = greatest;
            System.out.print(arr[i] + " ");
        }
//        for (int i = 0; i < arr.length; i++) {
//           System.out.print(arr[i] + " ");
//        }
    }
}
