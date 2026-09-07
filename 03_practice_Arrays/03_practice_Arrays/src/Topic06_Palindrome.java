public class Topic06_Palindrome {
    public static void main(String[] args) {
      int num = 121;

      int original = num;

      int reverse = 0;
        while (num > 0) {
            int rem = num % 10;//get last digit
            reverse = reverse * 10 + rem;
            num = num / 10;//remove last digit
        }
        if (reverse == original){
            System.out.println("palindrome");
        }else {
            System.out.println("not");
        }
    }
}
