import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 11/16/17.
 */
public class MergeArray {
    public static void main(String[]args){
        String[]a={"a","b","c"};
        String[]b={"d","e","f"};


        List s=new ArrayList(Arrays.asList(a));
        s.addAll(Arrays.asList(b));
       Object[]c= s.toArray();
        System.out.println(Arrays.toString(c));
    }
}
