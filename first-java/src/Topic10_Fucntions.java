import java.util.Scanner;

    public class Topic10_Fucntions {
        public static void main(String[] args) {


// it did not return anything
//        sum();

//  it returns values which we can use it later like in a variable
//        int ans = sum2();
//        System.out.println(ans);

//returning String
//        String hii = greet();
//        System.out.println(hii);

//Argument pass
            int ans = sum3(20, 60);
            System.out.println(ans);
    }

   ; //    //Creating a function
//    //About void (I will do some work, but I will NOT give any answer back.)
//    static void sum () {
//        Scanner input = new Scanner(System.in);
//        //we can also write int num1, num2, sum
//        System.out.print("enter 1st no. ");
//        int num1 = input.nextInt();
//        System.out.print("enter 1st no. ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(sum);
//
//    }


    //but if you return something dont use void
//    static int sum2() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("enter 1st no. ");
//        int num1 = input.nextInt();
//        System.out.print("enter 1st no. ");
//        int num2 = input.nextInt();
//
//
// //        System.out.println(sum);
//         return num1 + num2;//
//    }


        //return type as String

//        static String greet(){
//            String greeting = "how are you";
//
//            return greeting;
//        }


        //Arguments
        static int sum3(int a, int b){//now we need to pass two values
            int sum = a + b;
            return sum;
        }
}
