import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 11/16/17.
 */
public class RemoveArray {
    public static void main(String[]args){
        String[]a={"kb","sam","takoma"};

        List<String>s=new ArrayList<String>(Arrays.asList(a));
        s.remove("sam");
        a=s.toArray(new String[0]);
        System.out.println(Arrays.toString(a));


    }
}
