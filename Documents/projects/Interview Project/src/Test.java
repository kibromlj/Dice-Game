/**
 * Created by user on 12/7/17.
 */public class Test{
   int salary=10000;

        }class Programmer extends Test{
     int bonus=500;
     public static void main(String[]args){
         int totalsalary;
         Programmer p=new Programmer();
         totalsalary=p.salary+p.bonus;
         System.out.println("the salary of the employee is "+totalsalary);

     }
}





