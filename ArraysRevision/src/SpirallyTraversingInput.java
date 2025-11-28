import java.util.ArrayList;
import java.util.Scanner;

public class SpirallyTraversingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the matrix elements: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> ans = spirallyTraverse(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> spirallyTraverse(int[][] arr){
        ArrayList <Integer> ans = new ArrayList<>();

        int m = arr.length; int n = arr[0].length;
        int firstRow = 0;
        int lastRow = m-1;
        int firstCol = 0;
        int lastCol = n-1;

        while(firstRow <= lastRow && firstCol <= lastCol){
            //right
            for(int j = firstCol; j <= lastCol; j++)
                ans.add(arr[firstRow][j]);
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;
            //down
            for(int i = firstRow; i <= lastRow; i++ )
                ans.add(arr[i][lastCol]);
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            //left
            for(int j = lastCol; j >= firstCol; j--)
                ans.add(arr[lastRow][j]);
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            //up
            for(int i = lastRow; i >= firstRow; i--)
                ans.add(arr[i][firstCol]);
            firstCol++;

        }
        return ans;
    }
}
