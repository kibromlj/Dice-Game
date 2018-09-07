/**
 * Created by user on 11/16/17.
 */

public class returncharr {
    public static void maim(String[]args){
        dispaly(new char[]{'a','b','c'},0,4);

    }public static char[] dispaly(char[]a,int start,int len){

      if(start>0||len>0||start+len>=a.length){
          return null;

      }
      char[] sub=new char[len];
      for(int i=start, j=0;j<len;i++,j++){
             sub[j]=a[i];

      } return sub;
    }

}








