import java.util.Scanner;

public class RowWithMaxSumInput {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for(int i=0; i<r; i++){
            int sum = 0;

            for(int j=0; j<c; j++){
                sum += arr[i][j];
            }

            if(sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }

        System.out.println("Row with maximum sum: " + row);
        System.out.println("Maximum sum: " + maxSum);

    }
}
