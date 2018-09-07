import java.util.Arrays;

/**
 * Created by user on 11/29/17.
 */
public class InsertToSpecificPosition {
    public static void main(String[]args){
        int[]a={1,2,3,4,5,6,7};
        int Index_position=0;
        int NewValue=0;

        for (int i=a.length-1;i>Index_position;i--){
            a[i]=a[i-1];

        }
        a[Index_position]=NewValue;
        System.out.println(Arrays.toString(a));

    }
}