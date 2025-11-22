import java.util.ArrayList;

public class SpirallyTraversing {
    static void main() {
        int[][] arr = {

                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}

        };
        ArrayList<Integer> ans = SpirallyTraversing.spirallyTraverse(arr);
        System.out.println(ans);

    }
    public static ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int firstRow = 0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;
        while (firstRow <= lastRow && firstCol <= lastCol) {
            //right
            for (int j = firstCol; j <= lastCol; j++)
                ans.add(arr[firstRow][j]);
            firstRow++;
            if (firstRow > lastRow || firstCol > lastCol) break;
            //down
            for (int i = firstRow; i <= lastRow; i++)
                ans.add(arr[i][lastCol]);
            lastCol--;
            if (firstRow > lastRow || firstCol > lastCol) break;

            //left
            for (int j = lastCol; j >= firstCol; j--)
                ans.add(arr[lastRow][j]);
            lastRow--;
            if (firstRow > lastRow || firstCol > lastCol) break;

            // up
            for (int i = lastRow; i >= firstRow; i--)
                ans.add(arr[i][firstCol]);
            firstCol++;
        }
        return ans;

    }
}
