class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int maxLength =0;
        char[] arr = s.toCharArray();
        for(int i= 0 ; i<arr.length;i++){
            boolean[] visited = new boolean[256];
            int currentLength = 0 ;
            for(int j =i ;j<arr.length;j++)
            {   
                
                    if(visited[arr[j]]==true)
                    {
                        break;
                    }
                    visited[arr[j]] = true;
                currentLength = j - i + 1;
                
                maxLength = Math.max(maxLength, currentLength);
                }
               
               
            }
         return maxLength;
    }
}