package inheritancexample;

/**
 * Created by user on 4/4/17.
 */
public class jhon extends Stdemploye {
    int bonus=8000;
    void jhonsalary(){
        int totalsam=salary+bonus;
        System.out.println("the total salary for john is :"+totalsam);
    }
}
