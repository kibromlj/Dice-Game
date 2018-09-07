package thread;

/**
 * Created by user on 4/20/17.
 */
 class myclass  {
     public static int count;
     public static void main(String[]args){
         Thread t1=new Thread(new Runnable() {
             @Override
             public void run() {
                 for(int i=0;i<=10;i++){
                     count++;
                 }


             }
         });
         t1.start();
         try {
             t1.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println(count);
     }




}
