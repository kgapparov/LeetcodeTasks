package Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[left++] = nums[i];
            }
        }
        for (int i = left; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
    // Second approach
    public void moveZeroes2(int[] nums) {
        for (int i = 0, lastNonZeroIndex = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex++] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
