class Solution {
    public int splitArray(int[] nums, int k) {
        long l=0;
        long h=0;
        for(int x:nums){
            l=Math.max(l,x);
            h+=x;

        }
        long ans=h;
        while(l<=h){
            long mid=l+(h-l)/2;
            if(solve(nums,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)ans;
    }
   boolean solve(int[] arr,int k,long mid){
     int sum=0;
     int c=1;
     for(int i=0;i<arr.length;i++){
        if(sum+arr[i]<=mid){
            sum+=arr[i];
        }else{
            sum=arr[i];
            c++;
        }
     }
     return c<=k;
   }
}