
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int x:piles){
            r=Math.max(r,x);
        }
        int ans=r;
        while(l<=r){
            int k=l+(r-l)/2;
           if(isTrue(piles,h,k)){
             ans=k;
             r=k-1;
           }else{
             l=k+1;
           }

        }
       return ans;
    }
    boolean isTrue(int[] piles,int h,int k){
        long hours=0;
       for(int p:piles){
              hours+=(p+k-1)/k;
      }
           return hours<=h;
    }
}