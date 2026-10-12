class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k)return -1;
        
     long l=0;
    long h=0;
        for(int i:arr){
            l=Math.max(l,i);
            h+=i;
        }
        long ans=h;
        while(l<=h){
            long mid=l+(h-l)/2;
            
            if(solve(arr,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return (int)ans;
        
    }
    boolean solve(int[] arr,int k,long mid){
        int c=1;
        int sum=0;
        for(int  i=0;i<arr.length;i++){
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