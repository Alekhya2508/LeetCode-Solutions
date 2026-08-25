class Solution {
    public int removeDuplicates(int[] arr) {
        int count=1;
        int l=0;
        int n=arr.length;
        for(int r=1;r<n;r++){
            if(arr[l]!=arr[r]){
                 l++;
                 arr[l]=arr[r];
                count++;
            }
            
        }

        return count;
    }
}