import java.util.Scanner;

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //output
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
