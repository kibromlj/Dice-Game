package constr;

import java.util.Locale;

/**
 * Created by user on 4/25/17.
 */
public class demo{
    public static void main(String[]args){

        char ch[]={'w','e','l','c','o','m','e'};
        String s=new String(ch);//converting char array to string
        String s1="test";//creating string using String literal
        String s2=new String("this is new string using new keyword");//creating String using new Keyword
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        Locale kb = new Locale("fr", "CA");
        System.out.println(kb);

    }

}