import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {

        //Start with first position
        int insertPosition = 0;

        for(int i=0; i<nums.length; i++) {
            //fill all non-zero numbers
            if(nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,3,0,9,5,0,6};
        moveZeroes(nums); // can be used in static condition
//        MoveZeroes obj = new MoveZeroes(); //use in non-static condition
//        obj.moveZeroes(nums);  // modifies nums in place

        System.out.print(Arrays.toString(nums));
    }

}
