class Solution {
    public int maxProfit(int[] nums) {
         int max=Integer.MIN_VALUE;
          int min=nums[0];
         for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }else{
                int diff=nums[i]-min;
                max=Math.max(diff,max);
            }
            
         }


        return max==Integer.MIN_VALUE?0:max;





       /* int l=0;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int r=1;r<n;r++){
            if(nums[l]<nums[r]){
                int diff=nums[r]-nums[l];
                if(diff>ans){
                    ans=diff;
                }
              }else{
                l=r;
              }
        }
        return ans==Integer.MIN_VALUE?0:ans;*/
    }
}