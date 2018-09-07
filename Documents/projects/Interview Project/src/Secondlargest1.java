/**
 * Created by user on 11/14/17.
 */
public class Secondlargest1 {
    public static void main(String[]args) {
        int[]a={1,4,3,6,5,7};
        a1(a);

    }public static void a1(int[]b){
        int seclargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            if(b[i]>largest){
                seclargest=largest;
                largest=b[i];

            }else if(b[i]>seclargest){
                seclargest=b[i];

            }
        }
        System.out.println(seclargest);
        System.out.println(largest);
    }

}