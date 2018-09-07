/**
 * Created by user on 10/30/17.
 */
public class Smallest {
    public static void main(String[]args){
        int[]a={5,3,2,7,8,6,12};

        System.out.println(display(a));

    }public static int display(int[]b){
        int smallest=Integer.MAX_VALUE;
        for (int i:b
             ) {
            if(i<smallest){
                smallest=i;
            }
        }return smallest;
    }
}
