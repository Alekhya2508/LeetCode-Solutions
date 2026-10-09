class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int x:weights){
            low=Math.max(low,x);
            high+=x;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(solve(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean solve(int[] arr,int days,int k){
        int s=0;
        int c=1;
        for(int x:arr){
            if(s+x<=k){
                s+=x;
            }else{
                c++;
                s=x;
            }
        }
        return c<=days;
    }
}