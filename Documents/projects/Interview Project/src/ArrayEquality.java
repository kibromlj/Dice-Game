/**
 * Created by user on 11/30/17.
 */
public class ArrayEquality {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,3,5,};
        System.out.println(display(a,b));


    }

    public static boolean display(int[] a, int[] b) {
        boolean Equalotnot = true;

            for (int i = 0; i < a.length; i++) {
                if (a[i]!=b[i]) {
                    Equalotnot = false;

                }
            }



        return Equalotnot;

    }
}






