/**
 * Created by user on 11/29/17.
 */
public class CantReturn {
    public static void main(String[]args){
        a1(new int[]{12,13,14,16,17,18});

    }public static int[] a1(int[]b){
        int RemoveIndex=1;
        for (int i =RemoveIndex;i<b.length-1;i++){
            b[i]=b[i+1];
        }return b;




    }
}
