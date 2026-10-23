class Solution {
    public boolean isPalindrome(int x) {
        int rem =0;int original=x;
        if(original < 0)
        {
            return false;
        }
      while(x!=0)
      {
        rem = x%10 +rem*10;
        x=x/10;
       
      } 
      if(rem==original){
        return true;

      } 
    
      return false;
    }
}