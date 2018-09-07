/**
 * Created by user on 11/21/17.
 */
public class SecondLargest {
    public static void main(String[]args){
        a1(new int[]{1,2,3,4});
        a1(new int[]{4,1,2,3});
        a1(new int[]{1,1,2,3});
        a1(new int[]{1,1});
        a1(new int[]{1});
        a1(new int[]{});


    }public static void a1(int[]a){
        int Max1=-1;
        int Max2=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>Max1){
                Max2=Max1;
                Max1=a[i];
            }else if(a[i]!=Max1&&a[i]>Max2){
                Max2=a[i];


            }
            System.out.println(Max2);


        }System.out.println(Max2);




    }
}
