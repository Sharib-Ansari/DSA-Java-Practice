import java.util.ArrayList;
import java.util.Scanner;

public class Topic3_ArrayList {

    public static void main(String[] args) {
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        Scanner in = new Scanner(System.in);

//        list.add(89);//for adding the value
//        list.add(893);
//        list.add(8);
//        list.add(893);
//        list.add(899);
//        System.out.println(list);
//
//        list.set(0 , 1);
//        System.out.println(list);//add 1 in 0 index
//
//        list.remove(2);
//        System.out.println(list);//remove the index value of 2

        for (int i = 0; i < 5; i++) {
             list.add(in.nextInt());
        }
        System.out.print(list);
    }
}
