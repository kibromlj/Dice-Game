import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by user on 11/14/17.
 */
public class RemoveDuplicateInt {
    public static void main(String[]args){
        int[]a={1,2,3,4,5,3,5,7,3,4,5};
        display(a);


    }public static void display(int[]b){
        Set<Integer> s=new HashSet<>();
        for (int i:b
             ) {
              s.add(i);

        }
        Set<Integer>set=new LinkedHashSet<>(s);
        for (Integer integer :set
             ) {
            System.out.println(integer);

            
        }
    }
}