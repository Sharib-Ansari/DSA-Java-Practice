import java.util.Arrays;

public class Topic11_Swap {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//
//        //swaping
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);
        int[] arr = {1,2,3,4,5};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0]= 99;
    }
}
