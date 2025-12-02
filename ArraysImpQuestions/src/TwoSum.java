import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        int[] arr = new int[2];

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in arr: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements in the arr: ");
        for(int i=0; i<n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Indices of two numbers that add up to target: "
                + result[0] + ", " + result[1]);
        sc.close();

    }

}
