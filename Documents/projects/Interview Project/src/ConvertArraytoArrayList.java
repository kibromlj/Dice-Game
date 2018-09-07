import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 11/30/17.
 */
public class ConvertArraytoArrayList {
    public static void main(String[]args){
        String[]names={"kb","james","jacob","samuel"};
        display(names);



    }public static void display(String[]name){
        ArrayList<String>list=new ArrayList<String>(Arrays.asList(name));

        System.out.println(list);
    }
}