import java.util.Scanner;

public class RotateMatrixInput {
    static void rotate(int[][] arr) {
            for(int i=1; i<arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
            for(int i=0; i<arr[0].length; i++) {
                int stCol = 0,endCol = arr[0].length-1;
                while(stCol<endCol){
                    int temp = arr[i][stCol];
                    arr[i][stCol] = arr[i][endCol];
                    arr[i][endCol] = temp;
                    stCol++;
                    endCol--;
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the matrix: ");
            int n = sc.nextInt();

            int[][] arr = new int[n][n];

            System.out.println("Enter the elements row by row: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            rotate(arr);

            System.out.println("Matrix after 90degree clockwise rotation: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            sc.close();
        }

}
