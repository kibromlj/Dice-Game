/**
 * Created by user on 12/5/17.
 */
public class LargestAdjacentSum {
    public static void main(String[]args){
        int[]a={1,2,7,6,5,6,3};
        System.out.println(dislplay(a));

    }public static int dislplay(int[]b){
        int sum=0;
        int largest=0;

        for(int i=0;i<b.length-1;i++){
            sum=b[i]+b[i+1];
            if(sum>largest){
                largest=sum;
            }
        }return largest;
    }
}
