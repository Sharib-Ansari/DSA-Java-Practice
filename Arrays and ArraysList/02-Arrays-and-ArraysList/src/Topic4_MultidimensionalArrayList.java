import java.util.ArrayList;
import java.util.Scanner;

public class Topic4_MultidimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialisation (if it is not initi. it will get an error)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.print(list);
    }
}
