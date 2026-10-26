class Solution {
    public int reverseDegree(String s) {
        int temp=0;
        for(int i=0 ;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' )
            {
                int value = 122-ch+1;
                 temp = value * (i+1) + temp;
                 
            }
        }
      return temp; 
    }
}