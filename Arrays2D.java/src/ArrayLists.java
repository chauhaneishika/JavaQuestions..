import java.util.ArrayList;

public class ArrayLists {
    static void main() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(13); a.add(36); a.add(132);
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1); a.add(2); a.add(3);
        ArrayList<Integer> c = new ArrayList<>();
        a.add(2); a.add(3); a.add(5); a.add(7); a.add(11);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);


    }

}
