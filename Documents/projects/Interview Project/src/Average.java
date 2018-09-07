/**
 * Created by user on 11/29/17.
 */
public class Average {
    public static void main(String[]args){
        int[]a={1,2,3,4,5};
        System.out.println(average(a,5));

    }public static int average(int[]b,int len){
        int sum=0;

        for (int i=0;i<b.length;i++){
            sum+=b[i];

        }
        int average=sum/len;
        return average;

    }
}
