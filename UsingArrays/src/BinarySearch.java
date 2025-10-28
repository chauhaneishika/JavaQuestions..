import java.util.Arrays;

public class BinarySearch {
    static void main() {
        String[] sArray = {"Able","Mark","David"};
        Arrays.sort(sArray);
        if(Arrays.binarySearch(sArray,"Mark") >= 0) {
            System.out.println("Found Mark in the list..");
        }
    }
}
