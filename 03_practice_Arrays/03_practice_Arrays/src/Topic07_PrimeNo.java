//public class Topic07_PrimeNo {
//    public static void main(String[] args) {
//      int num = 7;
//        boolean isPrime = true;
//        for (int i = 2; i < num ; i++) {
//          if (num % i == 0){
//              isPrime = false;
//          }
//        }
//        if (isPrime == true){
//            System.out.println("prime");
//        }else {
//            System.out.println("not");
//        }
//
//
//    }
//}

//shorter way but it print 5 time prime

// public class Topic07_PrimeNo {
//    public static void main(String[] args) {
//        int num = 7;
//        for (int i = 2; i <num ; i++) {
//            if (num % i == 0){
//                System.out.print("not prime"+ " ");
//            }else {
//                System.out.print("prime"+ " ");
//            }
//
//        }
//    }
//}

//frm 50 to 100 prime
public class Topic07_PrimeNo {
    public static void main(String[] args) {

        for (int num = 50; num <= 100; num++) {

            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}



