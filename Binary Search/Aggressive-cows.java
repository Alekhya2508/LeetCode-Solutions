class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int l=1;
        int h=arr[arr.length-1]-arr[0];
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(solve(arr,k,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
 
    }
    boolean solve(int[] arr,int k,int mid){
        int prev=0;
        k=k-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[prev]>=mid){
                prev=i;
                k--;
            }
            if(k==0){
                return true;
            }
        }
        return false;
    }
}