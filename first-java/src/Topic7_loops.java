import java.util.Scanner;

public class Topic7_loops {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
//
//        System.out.print("enter the no. of iteration ");
//        int n = input.nextInt();
//
//        for (int num = 1; num <= n; num++){
//            System.out.println(num);
//            System.out.print("hello");
//        }
//
//        //while loop
//        int num = 1;
//        while (num <= 5)//we can also write while (num != 6)
//        {
//            System.out.println(num);
//            num ++;
//        }

//        //Do while loop
//        // it atleast run one time even the condition is false
//        int n = 1;
//        do {
//           System.out.println(n);
//           n++;
//        } while (n <= 5);


        // finding the maximum of 3 number
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
//
//        if(a > b && a > c)
//        {
//            System.out.println("a is max " + a);
//        }
//        else if(b > a && b > c)
//        {
//            System.out.println("b is max " + b);
//        }
//        else
//        {
//            System.out.println("c is max " + c);
//        }

        // shorter way to do this
//        int a = 23;
//        int b = 45;
//        int c = 65;
//
//        int max = Math.max(a, Math.max(b, c));
//
//        System.out.println(max);

        // check wheather the string is in uppercase or lower case
        char ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }

    }
}
