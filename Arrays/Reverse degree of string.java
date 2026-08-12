class Solution {
    public int reverseDegree(String s) {
        int[] freq=new int[26];
        for(int i=0;i<26;i++){
            freq[i]=26-i;
        }
        int  sum=0;
        int i=0;
        for(char ch:s.toCharArray()){
           sum+=freq[ch-'a']*(i+1);
           i++;
        }
        return sum;
        /* int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int reverseValue = 'z' - s.charAt(i) + 1;
            sum += reverseValue * (i + 1);
        }

        return sum; */
    }
}