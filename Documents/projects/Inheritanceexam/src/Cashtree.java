import java.util.Scanner;

/**
 * Created by user on 3/28/17.
 */
public class Cashtree {
    private String name;
    private int codeno;
    private String location;
    int balance;

   public Cashtree(){
        name="ATM World";
        codeno=5432;
        location="my place";
        balance=100000;
    }
    Scanner sc=new Scanner(System.in);
    public void ATM_INFO(){
        System.out.println(name);
        System.out.println(codeno);
        System.out.println(location;
    }
    void viewBalance(){
        System.out.println("your balance is"+balance);
    }
    void withdraw(){
        System.out.println("withdraw amount is:");
        int widrw=sc.nextInt();
        balance=balance-widrw;
    }
    void Deposit(){
        System.out.println("deposit amount is:");
        int depo=sc.nextInt();
        balance=balance+depo;
    }

}













