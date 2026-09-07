//public class Topic24_equilibriumIndex {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 3, 5, 2, 2};
//        int equilibrium = 2;//cheking at the index 2
//        int leftSum = 0;
//        int rightSum = 0;
//
//        for (int i = 0; i < equilibrium; i++) {
//            leftSum += arr[i];
//        }
//        for (int i = equilibrium + 1; i < arr.length; i++) {
//            rightSum += arr[i];
//        }
//        if (leftSum == rightSum) {
//            System.out.println("Equilibrium");
//        }else {
//            System.out.println("not equilibrium");
//        }
//    }
//}


///to check every element until we find the equilibrium
public class Topic24_equilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};

        // Try every index
        for (int equilibrium = 0; equilibrium < arr.length; equilibrium++) {

            int leftSum = 0;
            int rightSum = 0;

            // Calculate Left Sum
            for (int i = 0; i < equilibrium; i++) {
                leftSum += arr[i];
            }

            // Calculate Right Sum
            for (int i = equilibrium + 1; i < arr.length; i++) {
                rightSum += arr[i];
            }

            // Compare both sums
            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index = " + equilibrium);
                return;
            }
        }

        System.out.println("No Equilibrium Index");
    }
}

