import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTraingleInput {
    public static class PascalsTriangle {
        public List<List<Integer>> generate(int rows) {
            List<List<Integer>> ans = new ArrayList<>();
            for(int i=0; i<rows; i++) {
                ans.add(new ArrayList<Integer>());
                for(int j=0; j<=i; j++){
                    if(j==0 || j==i ) ans.get(i).add(1);
                    else{
                        int val = ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                        ans.get(i).add(val);
                    }
                }
            }
            return ans;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("Enter the traingle input: ");
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(n);

        System.out.println("\nGenerated Pascal Traingle:");
        for(List<Integer> row : result){
            System.out.println(row);
        }
    }
}
