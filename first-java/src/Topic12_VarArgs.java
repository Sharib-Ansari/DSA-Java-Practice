import java.util.Arrays;

public class Topic12_VarArgs {

    public static void main(String[] args) {

//        fun(2, 3, 34, 5, 6);
        fun2(24, 67, "hello");

    }

    static void fun2(int a,int b, String ...s){//it will store as many values as u pass but first u will give the value int and
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }


//    static void fun1(int... v) {//it will store as many values as u pass
//
//        System.out.println(Arrays.toString(v));
//
//    }
}
