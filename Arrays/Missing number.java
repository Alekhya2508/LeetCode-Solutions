class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor=n;
        for(int i=0;i<nums.length;i++){
            xor=xor^i^nums[i];
        }
        return xor;
    }
}