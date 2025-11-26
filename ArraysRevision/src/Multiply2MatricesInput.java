import java.util.ArrayList;
import java.util.Scanner;

public class Multiply2MatricesInput {
    public static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b) {

        int n = a.length;
        int[][] c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<n; j++){
                ans.get(i).add(c[i][j]);
            }
        }
        return ans;

    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size n of matrix (n*n): ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        System.out.println("Enter elements of matrix A: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++ ){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                b[i][j]= sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> ans = multiply(a,b);
        System.out.println("Result: ");
        System.out.println(ans);
    }
}
