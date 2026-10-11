class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int ans=-1;
        int l=0;
        int h=0;
        for(int x: bloomDay){
            l=Math.min(l,x);
            h=Math.max(h,x);
        }
        
        if((long)m*k>bloomDay.length) return -1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(solve(bloomDay,m,k,mid)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    boolean solve(int[] arr,int m,int k,int  days){
        int c=0;
        int b=0;
        for(int x:arr){
            if(x<=days){
                c++;
                if(c==k){
                    b++;
                    c=0;
                }
            }else{
                c=0;
            }
        }
        return b>=m;
        
    }
    
}