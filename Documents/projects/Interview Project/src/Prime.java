import java.util.ArrayList;

/**
 * Created by user on 11/21/17.
 */

public class Prime {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 8, 9, 49, 10, 12, 11};
        System.out.println(display(a));


    }

    public static ArrayList<Integer> display(int[] b) {
        ArrayList<Integer> s = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            int count = 0;
            for (int j = 1; j <= b[i]; j++) {
                if (b[i] % j == 0) {
                    count++;


                }
            }
            if (count == 2) {
                s.add(b[i]);
            }


        }return s;

    }

}