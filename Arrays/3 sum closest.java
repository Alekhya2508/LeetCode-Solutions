class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mindiff=Integer.MAX_VALUE;
        int minsum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) {
                     return sum;
                }else if(sum<target){
                    j++;
                }else{
                    k--;
                }
              int diff=Math.abs(target-sum);
             if(diff<mindiff){
                mindiff=diff;
                minsum=sum;
             }
            }

        }
        return minsum;
    }
}