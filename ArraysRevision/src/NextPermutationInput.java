import java.util.Scanner;

public class NextPermutationInput {

    public void nextPermutation(int[] nums) {

        if(nums == null || nums.length <= 1) return;

        int n = nums.length;
        int i;

        // Step 1: find pivot
        for(i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                break;
            }
        }

        // Step 2: if pivot exists, find successor and swap
        if(i >= 0) {
            for(int j = n - 1; j > i; j--) {
                if(nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
        }

        // Step 3: reverse suffix
        for(int left = i + 1, right = n - 1; left < right; left++, right--) {
            swap(nums, left, right);
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        NextPermutationInput np = new NextPermutationInput();
        np.nextPermutation(nums);

        System.out.print("Next Permutation: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

    }
}
