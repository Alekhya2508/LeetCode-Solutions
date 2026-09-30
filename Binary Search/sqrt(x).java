class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        long l=1;
        long r=x/2;
        while(l<=r){
            long mid=l+(r-l)/2;
            long sq=mid*mid;
            if(sq==x) return (int)mid;
            else if(sq<x) l=mid+1;
             else r=mid-1;

        }
        return (int)r;
        
    }
}