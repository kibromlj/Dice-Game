import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by user on 11/13/17.
 */
public class DuplicateNum {
    public static void main(String[]args){
        int[]a={2,5,6,2,3,4,5};
        sort(a);

    }public static void sort(int[]b){
        ArrayList<Integer> s=new ArrayList<>();
        for (int name:b
             ) {

            s.add(name);
        }
        Set<Integer>set=new LinkedHashSet<>(s);
        for (Integer integer:set
             ) {
            System.out.println(integer);
        }
    }



}

