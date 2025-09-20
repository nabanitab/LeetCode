package interview;

public class CheckCustomArrayList {
    public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    System.out.print("CustomArrayList elements: ");
    list.print();

    System.out.println("Element at index 2: " + list.get(2));

    list.remove(1); // remove element at index 1
    System.out.print("After removing index 1: ");
    list.print();

    System.out.println("Size of list: " + list.size());
}
}
