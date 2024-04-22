package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonFromThreeArrayList {

    public static void main(String[] args) {
        // Create three lists of employees
        List<CommonFromThreeArrayListForEmployee> list1 = new ArrayList<>();
        list1.add(new CommonFromThreeArrayListForEmployee(1, "John"));
        list1.add(new CommonFromThreeArrayListForEmployee(2, "Alice"));
        list1.add(new CommonFromThreeArrayListForEmployee(3, "Bob"));

        List<CommonFromThreeArrayListForEmployee> list2 = new ArrayList<>();
        list2.add(new CommonFromThreeArrayListForEmployee(2, "John"));
        list2.add(new CommonFromThreeArrayListForEmployee(4, "Carol"));
        list2.add(new CommonFromThreeArrayListForEmployee(5, "David"));

        List<CommonFromThreeArrayListForEmployee> list3 = new ArrayList<>();
        list3.add(new CommonFromThreeArrayListForEmployee(3, "John"));
        list3.add(new CommonFromThreeArrayListForEmployee(5, "David"));
        list3.add(new CommonFromThreeArrayListForEmployee(6, "Eve"));

        // Find common employees in list1 and list2, but not in list3
        List<CommonFromThreeArrayListForEmployee> result = findCommonAndNotInList3(list1, list2, list3);
        System.out.println("Common employees in list1 and list2, not in list3: ");
        System.out.println(result);
    }

    public static List<CommonFromThreeArrayListForEmployee> findCommonAndNotInList3(List<CommonFromThreeArrayListForEmployee> list1, List<CommonFromThreeArrayListForEmployee> list2, List<CommonFromThreeArrayListForEmployee> list3) {
        // Find common employees in list1 and list2
        Set<CommonFromThreeArrayListForEmployee> commonSet = new HashSet<>(list1);
        commonSet.retainAll(new HashSet<>(list2));

        // Remove employees present in list3
        Set<CommonFromThreeArrayListForEmployee> notInList3Set = new HashSet<>(commonSet);
        notInList3Set.removeAll(list3); // Remove directly without creating a new set

        // Convert the set to a list and return
        return new ArrayList<>(notInList3Set);
    }
}
