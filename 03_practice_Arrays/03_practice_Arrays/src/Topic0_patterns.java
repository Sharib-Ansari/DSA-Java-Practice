////hollow triangle
//public class Topic0_patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//
//            // Stars + inner spaces
//            for(int j = 1; j <= 2 * i - 1; j++) {
//
//                if(j == 1 || j == 2 * i - 1 || i == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                //System.out.print("*"); if we use this line and comment out the above if condition
//                //it will print the pyramid pattern
//            }
//
//            System.out.println();
//        }
//    }
//}

////hollow diamond
//public class Topic0_patterns {
//    public static void main(String[] args) {
//        int n = 5;
//
//        // Upper half
//        for(int i = 1; i <= n; i++) {
//            // Outer spaces
//            for(int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // Stars + inner spaces
//            for(int j = 1; j <= 2 * i - 1; j++) {
//
//                if(j == 1 || j == 2 * i - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        // Lower half
//        for(int i = n - 1; i >= 1; i--) {
//            // Outer spaces
//            for(int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            // Stars + inner spaces
//            for(int j = 1; j <= 2 * i - 1; j++) {
//
//                if(j == 1 || j == 2 * i - 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

public class Topic0_patterns {
    public static void main(String[] args) {

        int n = 7;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}