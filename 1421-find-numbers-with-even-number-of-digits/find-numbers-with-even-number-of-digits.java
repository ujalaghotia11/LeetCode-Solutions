class Solution {
    public int findNumbers(int[] nums) {
       
        int sum=0;
        for(int i=0;i<nums.length ; i++)
        {
             int temp = 0; 
           while(nums[i]!=0)
            {
                temp += 1;
                nums[i]=nums[i]/10;
            }
            if(temp%2==0)
            {
                sum+=1;
            }
        }
        return sum;
    }
}
