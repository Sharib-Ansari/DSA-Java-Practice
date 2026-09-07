public class Topic17_isAllElementIsUnique {
    public static void main(String[] args) {
      int [] arr = {10, 20, 10, 30, 10, 40, 50};

        for (int i = 0; i < arr.length ; i++) {

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate found");
                    return;
                }
            }
        }
        System.out.println("all elements are unique");
    }
}



