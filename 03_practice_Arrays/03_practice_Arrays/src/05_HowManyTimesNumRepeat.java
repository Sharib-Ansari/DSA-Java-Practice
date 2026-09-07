class HowManyTimesNumRepeat {
    public static void main(String[] args) {
      int num = 22226767;
      int Digit = 2;
       int Frequency = 0;

       while(num > 0){
           int rem = num % 10;//o/p 7 and then 6 and then 7 , 6,2,2,2,2

           if (rem == Digit){
               Frequency ++;
           }
           num = num / 10;
       }
        System.out.println(Frequency);
    }
}
