package hashSet;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {
    public static void main(String[] args) {
        int arr[] = {15, 16, 27, 27, 28, 15};

        int result = getDistincEle(arr);
        System.out.println(result);
    }

    private static int getDistincEle(int arr[]) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
            hs.add(arr[i]);

        return hs.size();
    }
}
