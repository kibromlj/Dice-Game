import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by user on 11/30/17.
 */

public class CommonElements {
    public static  void main(String[]args){
        String[]array1={"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[]array2={"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        HashSet<String>s=new LinkedHashSet<>();

        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if(array1[i].equals(array2[j])){

                    s.add(array1[i]);

                }

            }
        }
        System.out.println(s);


        }

    }




