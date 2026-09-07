public class Topic13_overloading {
    // when we have same function name but different parameters is called overloading
    public static void main(String[] args) {
       //if we give only two values
        // int result = fun(3,4);//o/p 7
         //System.out.println(result);
        
       //if we give 3 values
        int result = fun(2,3,4);
       System.out.println(result);//o/p9
    }
    static int fun (int a, int b) {
        return a + b;
    }

    static int fun (int a, int b, int c){
        return a+b+c;
    }

//    static String fun (String c) {
//       return c;
//    }

}
