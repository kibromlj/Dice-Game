/**
 * Created by user on 11/22/17.
 */
public class Onionarray {
    public static int isOnionArray(int[] arr) {
        int len = arr.length;
        int k = 0;
        int j;
        // note that k cannot equal 0
        // then j = len
        // arr[len] --> out of bounds exception
        // start counting from 1
        for (k = 1; k < len; k++) {
            // recall that j + k = length
            // so  j = length-k
            // simple math
            j = len-k;
            // it is possible that j might equal k
            // but the instructions say to ignore this case
            if (j != k && (!(arr[k] + arr[j] <= 10))) {
                // if not an onion array
                // automatically return like the handout says
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // test cases
        int[] a1 = {0, 1, 3, 4, 7};
        int[] a2 = {0, 4, 3, 4, 7};
        System.out.println(isOnionArray(a1));
        System.out.println(isOnionArray(a2));
    }
}
    

