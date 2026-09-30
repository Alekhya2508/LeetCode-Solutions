class Solution {
    public int searchInsert(int[] arr, int target) {
        if(target<arr[0]) return 0;
        if(target>arr[arr.length-1]) return arr.length;
    int l=0;
    int r=arr.length-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) l=mid+1;
        else r=mid-1;
    }
   return l;









     
     
     
     
     
     
     
     
     
     
     
     
     
       /* int n=arr.length;
          int left = 0;
int right = n - 1;
     if(arr[0]>=target) return 0;
while (left <= right) {

    int mid = left + (right - left) / 2;

    if (arr[mid] == target) {
        return mid;
    } else if (arr[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}
return left;*/


    }
}