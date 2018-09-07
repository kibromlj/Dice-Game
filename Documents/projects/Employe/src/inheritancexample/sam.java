package inheritancexample;

/**
 * Created by user on 4/4/17.
 */
public class sam extends Stdemploye {
    int bonus=15000;
    void samsalary(){
        int totalsam=bonus+salary;
        System.out.println("the total salary for inheritancexample.sam is :"  +totalsam);
    }

}
