//public class OutputIn2DArray {
//    static void main() {
//        //int[][] arr = new int[3][4];
//        //int[][] arr = {{6,0,2,7},{1,3,7,2},{9,9,4,5}};
//        //System.out.println(arr.length); // no. of rows
//        System.out.println(arr.length+" "+arr[0].length); // no. of rows + no. of columns
//        for(int i = 0; i<3;i++) {
//            for(int j = 0; j<4; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;

public class OutputIn2DArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        System.out.println("Enter array elements: ");
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}