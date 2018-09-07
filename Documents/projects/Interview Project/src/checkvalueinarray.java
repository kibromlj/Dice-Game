/**
 * Created by user on 11/26/17.
 */

public class checkvalueinarray {
    public static void main(String[]args){
        int[]a={1,2,3,4,5};
        System.out.println(contain(a,9));

    }public static boolean contain(int[]b,int item){
        for (Integer n:b
             ) {
            if(item==n){
                return true;
            }

        }return false;

    }
}