class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<nums[i]){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}