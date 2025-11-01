public class NextPermutation {
    public void  nextPermutation(int[] nums) {
        if(nums == null || nums.length <=1) return;

        int n = nums.length;
        int i;

        for( i = n-2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if(i >= 0) {
            for(int j = n-1; j > i; j--) {
                if(nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
        }
        for (int left = i + 1, right = n - 1; left < right; left++, right--) {
            swap(nums, left, right);
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] nums = {1, 2, 3};
        np.nextPermutation(nums);
        // Output should be [1, 3, 2]
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
