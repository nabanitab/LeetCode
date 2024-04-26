import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
    /*    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,3,4,4));

        List<Integer>lists =list.stream().filter(n-> n%2).collect(Collectors.toList());
        */

        Pen pen1 = new Pen("nataraj","red");

        Pen pen2 = new Pen("nataraj","red");

        System.out.println(pen1.equals(pen2));
    }


}

class Pen{

    public String name;
    public String colour;

    public Pen(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }


}
//student oneToMany

/*salary :

select MaxSalary as thirdMAxSalary from Employee where (select Max)


getCandidateById(int id)


select * from Candidate where id = ?;*/
//address