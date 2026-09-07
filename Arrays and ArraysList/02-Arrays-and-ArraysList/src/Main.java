import java.util.Arrays;
import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //this is called array of primitive
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 231;
//        arr[2] = 233;
//        arr[3] = 234;
//        arr[4] = 235;
//        //manually assigning the values
//        System.out.println(arr[2]);//233
//
//        //if we dont know the length of the input array
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        //to make it like a string
        // System.out.println(Arrays.toString(arr));

      //array of objects
      String[] str = new String[5];
      for (int i = 0; i < str.length; i++){
          str[i] = input.next();
      }
        System.out.println(Arrays.toString(str));
      // modify
        str[1] = "sharib";
        System.out.println(Arrays.toString(str));



    }
}
