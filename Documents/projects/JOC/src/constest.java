/**
 * Created by user on 12/22/17.
 */
public class constest {
    int salary = 1000;
}
class student extends constest {
    int bonus = 500;
    public static void main(String[]args){
student st=new student();
        System.out.println("The salary of the student is "+st.salary);
        System.out.println("Bonus for the student is "+st.bonus);

    }

}



