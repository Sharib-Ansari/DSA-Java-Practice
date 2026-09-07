//First: What is the question actually asking? 🤨
//
//        We have:
//
//        arr = [20, 15, 26, 2, 98, 6]
//
//        We need to replace every number with its rank.
//
//        What is rank?
//
//        First, arrange the numbers from smallest to largest:
//
//        [2, 6, 15, 20, 26, 98]
//
//        Now give each number a position/rank:
//
//        Number:  2   6   15   20   26   98
//        Rank:    1   2    3    4    5    6
//
//        So:
//
//        2  → 1
//        6  → 2
//        15 → 3
//        20 → 4
//        26 → 5
//        98 → 6
//
//        Now go back to the original array:
//
//        [20, 15, 26, 2, 98, 6]
//
//        Replace each number:
//
//        20 → 4
//        15 → 3
//        26 → 5
//        2  → 1
//        98 → 6
//        6  → 2
//
//        Final:
//
//        [4, 3, 5, 1, 6, 2]

import java.util.Arrays;

public class topic9_ReplaceElementWithRank {
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6};

        int[] copy = {20, 15, 26, 2, 98, 6};

        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        //[2, 6, 15, 20, 26, 98]
        // 0   1   2   3   4   5 index

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < copy.length; j++) {

                if(arr[i] == copy[j]){
                    arr[i] = j + 1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
