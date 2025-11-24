import java.util.Scanner;

public class SearchMatrixInput {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int i =0,j=n-1;

        while(i<m && j>=0){
            if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        int arr[][] = new int [r][c];

        System.out.println("Enter search matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int target = sc.nextInt();
        SearchMatrixInput sm = new SearchMatrixInput();
        boolean found = sm.searchMatrix(arr,target);

        System.out.println("Found? " + found);

    }
}
