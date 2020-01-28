import java.util.ArrayList;

class PrintList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            myList.add(i);
        }
        System.out.print(myList);

    }
}