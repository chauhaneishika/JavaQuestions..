public class ShallowAndDeepCopy {
    static void main() {
        int[][] arr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};
        int[][] brr = {{6, 0, 2, 7, 6}, {1, 3, 7, 2, 2}, {9, 9, 4, 5, 2}};
        brr[1][3] = 20;
        System.out.println(arr[1][3]);
    }
}