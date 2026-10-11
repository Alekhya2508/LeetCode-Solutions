class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int l=1;
        int ans=-1;
        int h=position[n-1]-position[0];
         while(l<=h){
            int mid=l+(h-l)/2;
            if(solve(position,m,mid)){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
         }
         return ans;
    
    }
    boolean solve(int[] arr,int m,int dis){
        int c=1;
        int prev=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[prev]>=dis){
                c++;
                prev=i;
            }
            if(c==m) return true;
        }
       return false;

    }
}