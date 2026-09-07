public class Topic22_MajorityElements {/// brute force approach
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 2, 2, 5, 2, 5, 1};

        int halfArr = arr.length / 2;
        int frequency = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency ++;
                }
            }

            if(frequency > halfArr) {
                System.out.println("Majority Element = " + arr[i]);
                return;
            }
        }

        System.out.println("No Majority Element");


    }
}
