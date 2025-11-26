import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesInput {
    public static void moveZeores(int[] nums){
        int insertPosition = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition< nums.length){
            nums[insertPosition++] = 0;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[]nums = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        moveZeores(nums);

        System.out.println("Output array:");
        System.out.print(Arrays.toString(nums));
    }
}
