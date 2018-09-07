package con;

import java.util.Arrays;

/**
 * Created by user on 4/17/17.
 */
public class demo {
    public static void main(String[]args)throws Exception{
        char []chars=new char[]{'\u0097'};
        String str=new String(chars);
        byte[]bytes=str.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
}
