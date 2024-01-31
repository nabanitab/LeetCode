package dataStructureByGFG;

public class TowerOfHonoi {
    static void TOH(int n, char A,char B, char C){
        if(n ==1){
            System.out.println("move 1 from " + A + "to" +C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("move"+ n + "from" + A + "to +c");
        TOH(n-1,B,A,C);

    }

    public static void main(String[] args) {
        int n = 2;
        TOH(n,'A','B','C');
    }
}
