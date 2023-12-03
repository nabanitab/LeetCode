package string;

public class JewelsAndStonesCounter {
    public int countJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStonesCounter counter = new JewelsAndStonesCounter();

        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println("Output 1: " + counter.countJewelsInStones(jewels1, stones1));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println("Output 2: " + counter.countJewelsInStones(jewels2, stones2));
    }
}

