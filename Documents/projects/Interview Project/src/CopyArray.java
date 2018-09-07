import java.util.Arrays;

/**
 * Created by user on 11/29/17.
 */
public class CopyArray {
    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9,10};
        int new_array[]=new int[10];
        for (int i=0;i<array.length;i++){
            new_array[i]=array[i];
        }
        System.out.println(Arrays.toString(new_array));

    }
}