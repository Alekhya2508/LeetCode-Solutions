class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low=1;
        int high=10_000_000;
        int ans=-1;
      while(low<=high){
        int mid=low+(high-low)/2;
        if(solve(dist,hour,mid)){
            ans=mid;
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
  return ans;
    }
    boolean solve(int[] dist,double hour,int mid){
        double h=0;
        for(int i=0;i<dist.length;i++){
            if(i<dist.length-1)  h+=Math.ceil((double)dist[i]/mid);
            else h+=(double)dist[i]/mid;
        }
        return h<=hour;
    }
}