import java.util.Scanner;

public class Topic2_takeInput {

   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number ");
//        int num = sc.nextInt();// it just take any no. from user
//
//        System.out.println("The number "+num);

//        String name = sc.next();//it just take only first word of the string
//        System.out.println(name);

        String name = sc.nextLine();//it take the entire word of the string
        System.out.println(name);
    }
}
