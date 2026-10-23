class Solution {
    public int reverse(int num){
        long rem = 0 ;
      while(num!=0)
      {
        rem = num%10  +rem*10 ;
        num=num/10;
      }
      if (rem > Integer.MAX_VALUE || rem < Integer.MIN_VALUE) {
            return 0; 
        }
      return (int)rem;
    }
}