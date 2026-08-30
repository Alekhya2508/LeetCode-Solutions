class Solution {
    public int myAtoi(String s) {
        int i=0;
         while(i<s.length() && s.charAt(i)==' '){
            i++;

         }
         long sign=1;
         if(i<s.length()&& (s.charAt(i)=='+'|| s.charAt(i)=='-')){
            if(s.charAt(i)=='+'){
                 sign=1;
            }
            else{
                sign=-1;
            }
            i++;
         }
         return funt(s,i,0,sign);
    }
    int  funt(String s,int i,long num,long sign){
        if(i>=s.length() || (!Character.isDigit(s.charAt(i)))){
            return (int)(sign*num);
        }
        num=num*10+(s.charAt(i)-'0');
         if (sign * num <=Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return funt(s,i+1,num,sign);
    }
}