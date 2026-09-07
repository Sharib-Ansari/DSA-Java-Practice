class FibonacciSeries {
    public static void main(String[] args) {
     int n = 7;
     int a = 0;
     int b = 1;
        for (int i = 1; i <= n ; i++) {
            System.out.print(a + " , ");
            //main logic
            int c = a + b;
            a = b;
            b = c;


        }
    }
}
