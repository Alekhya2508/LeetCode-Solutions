class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int l=0;
        int r=arr.length-1;
        int a1=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                a1=mid;
                r=mid-1;
            }else if(arr[mid]<target){
                l=mid+1;
                }else{
                r=mid-1;
            }
        }
        if (a1 == -1) {
                   return 0;
               }

          l=0;
         r=arr.length-1;
         int a2=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                a2=mid;
                l=mid+1;
            }else if(arr[mid]<target){
                l=mid+1;
                }else{
                r=mid-1;
            }
        }
        return a2-a1+1;
    }
}
