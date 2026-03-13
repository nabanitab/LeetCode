package arrayProgram.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterSalary {

    public static void  main(String[] args){

        List<Integer> salary = new ArrayList<>();

        salary.add(3000);
        salary.add(5000);
        salary.add(2300);
        salary.add(10000);
        salary.add(9300);

       /* int count = 0;

        for(Integer o : salary){
        if(o>3000){
            count++;
        }
        }

        System.out.println(count);*/

        //1.stream create a stream
        //2. intermediate operation: filer
        //3. terminal operation : map(only one time, after that stream close)
        Long no= salary.stream().filter((Integer salarys )-> salarys > 3000).count();
        System.out.println(no);
    }
}
