class Solution { public void combination(int[] nums,List<List<Integer>> ans,List<Integer> list,boolean[] freq) {
          if(list.size()==nums.length){
           
            ans.add(new ArrayList<>(list));
            return;
            
          }

          for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !freq[i-1]) continue;
            if(!freq[i]){
                freq[i]=true;
                list.add(nums[i]);

                combination(nums,ans,list,freq);
                list.remove(list.size()-1);
                freq[i]=false;
            }
          }
          
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] freq=new boolean[nums.length];
        combination(nums,ans,list,freq);
        return ans;   
        
    }
} 