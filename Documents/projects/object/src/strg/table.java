package strg;

/**
 * Created by user on 4/18/17.
 */
public class table {
    public static void main(String[]args){
        String s=new String("Hello world   ");
        String sub=s.substring(4,10);
        String trimmed=s.trim();
        String kb=s.toUpperCase();
        System.out.println(sub);
        System.out.println(trimmed);
        System.out.println(kb);

    }
}
