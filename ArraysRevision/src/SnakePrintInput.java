import java.util.Scanner;

public class SnakePrintInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements row by row: ");
        for(int i=0; i<r;i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Snake print of the array: ");
        for(int i=0; i<r; i++){
            if(i%2 == 0){
                for(int j=0; j<c; j++){
                    System.out.print(arr[i][j]+" ");
                }
            } else{
                for(int j=c-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
