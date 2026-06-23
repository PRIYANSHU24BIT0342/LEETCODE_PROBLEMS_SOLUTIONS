class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount=0;

        
        int right=0;
        while(right<nums.length){
            if(nums[right]==1){
                count++;
                right++;
                maxcount=Math.max(count,maxcount);
            }
            else{
                count=0;
                right++;
            }

        }
        return maxcount;
        
    }
}