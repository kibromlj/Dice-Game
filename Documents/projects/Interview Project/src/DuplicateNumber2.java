/**
 * Created by user on 12/1/17.
 */

public class DuplicateNumber2 {
    public static void main(String[]args){
        int[]a={12,23,14,12,23,15,16};
        a1(a);


    }public static void a1(int[]b){
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]==b[j]&&i!=j){

                    System.out.println(b[j]);
                }
            }



        }

    }
}