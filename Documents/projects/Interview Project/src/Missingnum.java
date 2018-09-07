/**
 * Created by user on 10/30/17.
 */
public class Missingnum {
    public static void main(String[]args){
        int [] a={1,2,3,5,6};
        int missingnumber=getmissingnumber(a,6);
        System.out.println(missingnumber);
    }public static int getmissingnumber(int [] b,int n){


        int equation=(n*(n+1)/2);
        int sum=0;
        for (int i:b
             ) {
            sum=sum+i;

        }return equation-sum;
    }
}







