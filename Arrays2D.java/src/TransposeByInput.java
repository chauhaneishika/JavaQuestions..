import java.util.Scanner;

public class TransposeByInput {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        print(arr);

        int[][] trans = new int[c][r];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transposed Matrix: ");
        print(trans);
    }

    private static void print(int[][] arr) {
        for(int[] row : arr) {
            for(int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
