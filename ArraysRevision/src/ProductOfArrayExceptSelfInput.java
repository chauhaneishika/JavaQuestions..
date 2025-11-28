import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelfInput {
    public static int[] ProductOfArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);

        for(int i=1; i<n; i++) {
            ans[i] = ans [i-1] * nums[i-1];
        }

        int suffix = 1;
        for(int i=n-2; i>=0; i--) {
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }
        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = ProductOfArray(nums);
        System.out.println(Arrays.toString(result));

    }
}
