/**
 * Created by user on 11/21/17.
 */
public class OddEvenSubtr {
    public static void main(String[]args){
        a2(new int[]{1});
        a2(new int[]{1,2});
        a2(new int[]{1,2,3});
        a2(new int[]{1,2,3,4});
        a2(new int[]{3,3,4,4});
        a2(new int[]{4,1,2,3});
        a2(new int[]{1,1});
        a2(new int[]{});

    }public static void a2(int[]a){
        int sumeven=0;
        int sumodd=0;


        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                sumeven+=a[i];
            }else{
                sumodd+=a[i];
            }

        }
        System.out.println(sumodd-sumeven);

    }

}
