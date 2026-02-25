class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0; // where next non-zero should be placed

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                // swap nums[i] and nums[index]
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }
    }
}