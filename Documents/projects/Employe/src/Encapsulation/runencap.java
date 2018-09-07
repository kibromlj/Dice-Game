package Encapsulation;

/**
 * Created by user on 4/4/17.
 */
public class runencap {
    public static void main(String[]args){
        encap kb=new encap();
        kb.setName("kibrom");
        kb.setIdname("one");
        kb.setAge("12345");
        System.out.println("his name is: "+kb.getName()+" and his age is : "+kb.getAge()+  "  his id is :"+kb.getIdname());
    }
}
