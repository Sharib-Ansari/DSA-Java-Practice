/*
 * Container With Most Water
 *
 * Question:
 * Choose TWO walls that can hold the maximum amount of water.
 *
 * Remember:
 * - arr[i] = height of a wall
 * - width  = rightWall - leftWall
 * - height = shorter of the two walls
 * - water  = width * shorter wall
 *
 * Two Pointer Logic:
 * - Start left at 0 and right at last index.
 * - Calculate water for the current pair.
 * - Save the maximum water.
 * - Move the SHORTER wall inward:
 *      left wall shorter  -> leftWall++
 *      right wall shorter -> rightWall--
 *
 * Why move the shorter wall?
 * The shorter wall limits the water height.
 * Moving the taller wall cannot increase the height.
 */

public class topic14ContainerWithMostWater {
    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int max = 0;

        int leftWall = 0;
        int rightWall = arr.length-1;

        int bestLeft = 0;
        int bestRight = 0;

        while(leftWall < rightWall){
            int shorterWall;

            if(arr[leftWall] < arr[rightWall]){
              shorterWall = arr[leftWall];
            }else {
                shorterWall = arr[rightWall];
            }
//          water = distance b/w wall * height of shorter wall
            int water = (rightWall - leftWall) * shorterWall;

            if(water > max){
              max = water;
              bestLeft = leftWall;
              bestRight = rightWall;
            }

            if (arr[leftWall] < arr[rightWall]) {
                leftWall++;
            } else {
                rightWall--;
            }
        }
        System.out.println("Maximum water = " + max);

        System.out.println("Container with most water is "
                + arr[bestLeft] + " and " + arr[bestRight]);
    }
}
