import java.util.Scanner;

   // fibonacci series

//public class Topic8_fibonacci_series {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter number of terms: ");
//        int n = input.nextInt();
//
//        int a = 0;
//        int b = 1;
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//
//            int c = a + b;
//            a = b;
//            b = c;
//
//        }
//    }
//}

  //count the frequecy of a repeated no.

//public class Topic8_fibonacci_series {
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter Number: ");
//        int num = input.nextInt();
//
//        System.out.print("Enter Digit: ");
//        int digit = input.nextInt();
//
//        int count = 0;
//
//        while (num > 0){
//            int rem = num % 10;//gives last digit
//
//            if(rem == digit){
//                count ++;
//            }
//            // move on to the next number from backward
//            num = num / 10;
//        }
//        System.out.println("Frequency = " + count);
//    }
// }

    //Reverse the given number

    public class Topic8_fibonacci_series {
      public static void main(String[] args){
          Scanner input = new Scanner(System.in);

          System.out.print("Enter Number: ");
          int num = input.nextInt();

          int reverse = 0;

          while(num > 0)
          {
              int rem = num % 10;

              reverse = reverse * 10 + rem;//to logically add the no.

              num = num / 10;
          }

          System.out.println("Reverse Number = " + reverse);

         }
    }


//   //The calculator
//   public class Topic8_fibonacci_series {
//      public static void main(String[] args){
//          Scanner input = new Scanner(System.in);
//
//          while (true) {//for continuously perform action
//              IO.print("Enter the 1st number ");
//              int a = input.nextInt();
//
//              IO.print("Enter the 2st number ");
//              int b = input.nextInt();
//
//              IO.print("Enter operator ");
//              char op = input.next().trim().charAt(0);
//
//              if (op == '+') {
//                  IO.println("Result = " + (a + b));
//              }
//              if (op == '-') {
//                  IO.println("Result = " + (a - b));
//              }
//              if (op == '*') {
//                  IO.println("Result = " + (a * b));
//              }
//              if (op == '/') {
//                  if (b != 0) {
//                      IO.println("Result = " + (a / b));
//                  }
//              }
//              if (op == '%') {
//                  IO.println("Result = " + (a % b));
//              }
//          }
//
//      }
//   }

//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        int original = num;
//        int reverse = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num = num / 10;
//        }
//
//        if (original == reverse) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not a Palindrome");
//        }
//
//        sc.close();
//    }
//}

