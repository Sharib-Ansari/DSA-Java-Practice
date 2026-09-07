import java.util.Scanner;

import java.util.Scanner;

public class Topic9_Switch_cases
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

//        String fruit = input.next();
//
//        switch (fruit)
//        {
//            case "mango":
//                System.out.println("The king of fruits");
//                break;
//
//            case "apple":
//                System.out.println("Red fruit");
//                break;
//
//            default:
//                System.out.println("Enter a valid fruit");
//        }

//        //enhance version
//        switch (fruit) {
//            case "mango" -> System.out.println("The king of fruits");
//            case "apple" -> System.out.println("Red fruit");
//            default -> System.out.println("Enter a valid fruit");
//        }


        //nested Switch case

        int empId = input.nextInt();
        String detail = input.next();

        switch (empId) {
            case 1 -> System.out.println("sharib ansari");
            case 2 -> System.out.println("kokab");
            case 3 -> {
                switch (detail) {
                    case "it" -> System.out.println("it depart");
                    case "cs" -> System.out.println("cs depart");
                    default -> System.out.println("enter valid department");
                }
            }
            default -> System.out.println("enter valid no");
        }
    }
}
