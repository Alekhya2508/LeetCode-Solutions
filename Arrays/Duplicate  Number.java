class Solution {
    public int findDuplicate(int[] nums) {
      /*  int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
            
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(i=0;i<n;i++){
           if(nums[i]!=(i+1)){
            return nums[i];
           }
       } 
       return 0;*/
       int slow=nums[0];
       int fast=nums[0];
       do{
        slow=nums[slow];
        fast=nums[nums[fast]];

       }while(slow!=fast);
       
       slow=nums[0];
       while(slow!=fast){
        slow=nums[slow];
        fast=nums[fast];
       }
       return slow;
    }

}