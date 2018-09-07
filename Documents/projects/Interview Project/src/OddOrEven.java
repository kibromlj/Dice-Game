/**
 * Created by user on 11/16/17.
 */
public class OddOrEven {
    public static void main(String[] args) {
        int[] b = {2,4,6,8};

        a1(b,4);
    }
    public static void a1(int[] a,int len) {
        int result = 1;
        for (int i = 0; i < len&&result==1; i++) {
            if (a[i] % 2 == 1) {
                result = 0;

            }

        }
        System.out.println(result);
    }
}