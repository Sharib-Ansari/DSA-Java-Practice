public class Topic13_isArraySorted {
    public static void main(String[] args) {
         int [] arr = {10, 20, 15, 40, 50};

         boolean isSorted = true;

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("sorted");
        }else {
            System.out.println("not sorted");
        }
    }
}