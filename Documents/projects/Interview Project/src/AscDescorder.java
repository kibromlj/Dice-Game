import java.util.Arrays;
import java.util.Collections;

/**
 * Created by user on 11/15/17.
 */
public class AscDescorder {
    public static void main(String[]args){
        String[] alp={"d","c","a","b"};
        Arrays.sort(alp);

        System.out.println(Arrays.toString(alp));
        for (String i:alp){
            Arrays.sort(alp, Collections.reverseOrder());
            System.out.println(Arrays.toString(alp));
        }

        }


    }


