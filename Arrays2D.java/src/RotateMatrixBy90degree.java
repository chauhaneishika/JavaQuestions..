import java.util.Arrays;

public class RotateMatrixBy90degree {
    static void rotate(int arr[][]) {
        //Transpose
        for(int i=1;i<arr.length;i++) {
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reverse Each Row
        for(int i=0; i<arr.length; i++) {
            int stCol = 0, endCol = arr[0].length - 1;
            while(stCol<endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
    }

    static void main() {
        int arr[][] = {{1,2,3},{5,6,7},{2,2,0}};
        rotate(arr);
        System.out.print(Arrays.deepToString(arr));
    }
}

