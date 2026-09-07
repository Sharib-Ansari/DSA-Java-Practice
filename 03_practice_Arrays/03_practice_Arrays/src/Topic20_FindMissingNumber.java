public class Topic20_FindMissingNumber {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 5};
      int sum = 0;
      int expected = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        int n = arr.length + 1;

        expected = n * (n + 1) / 2;

        System.out.println("Actual Sum = " + sum);
        System.out.println("Expected Sum = " + expected);
        System.out.println("Missing Number = " + (expected - sum));


    }
}
