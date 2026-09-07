public class Topic9_Max_arr {
    public static void main(String[] args) {
       int [] arr = {10, 30, 50, 80,};
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
           if (arr[i] > max){
               max = arr[i];
           }
        }
        System.out.println(max + " , ");
    }
}
