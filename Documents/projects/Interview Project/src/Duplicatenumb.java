import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 11/14/17.
 */
public class Duplicatenumb {
    public static void main(String[]args) {
        int[]a={7,8,9,4,5,2,4,100};
        int duplicatenumber=display(a);
        System.out.println(duplicatenumber);


    }public static int display(int[]b){
        int i=0;
        Set<Integer> s=new HashSet<>();
        for (int number:b
             ) {
            if(s.add(number)==false){

                i=number;

            }

        }return i;

    }

}
