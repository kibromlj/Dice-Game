/**
 * Created by user on 11/30/17.
 */
public class LargestndSmallest {
    public static void main(String[]args){
        int[]a={6,3,2,4,5,8,9,7};
        System.out.println(small(a));


    }public static int small(int[]b) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (Integer i : b) {
            if (i < smallest) {
                smallest = i;
            } else if (i > largest) {
                largest = i;

            }
        }
        return smallest;

    }
    }
