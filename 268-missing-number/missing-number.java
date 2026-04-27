class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        // XOR all indices and values
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }

        // XOR with n
        return xor ^ n;
    }
}