package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddAndRetriveElement {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(4);
        num.add(6);

        for (int number:num
             ) {
            System.out.println(number);
        }
    }
}
