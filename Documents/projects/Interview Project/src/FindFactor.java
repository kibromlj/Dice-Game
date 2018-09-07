/**
 * Created by user on 11/14/17.
 */
public class FindFactor {
    public static void main(String[]args){

       int factor=display();
        System.out.println(factor);

    }public static int display(){
        int n=0;
        for(int i=1;i<=100;i++){
            for (int j=1;j<=i;j++){
                if(i%j==0){


                   n=j;
                }
            }
        }return n;
    }

}
