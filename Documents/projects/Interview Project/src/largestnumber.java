import java.util.Arrays;

/**
 * Created by user on 11/10/17.
 */
public class largestnumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 5};
        Arrays.sort(a);
        System.out.println(a[a.length - 2]);

    }
}
