class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long seclargest =Long.MIN_VALUE;
        long thirdlargest = Long.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            long num =nums[i];

            if(num==largest||num==seclargest||num==thirdlargest){
                continue;
            }
            else if(num>largest){
                thirdlargest = seclargest;
                seclargest=largest;
                largest=num;
            }
            else if(num>seclargest){
                thirdlargest=seclargest;
                seclargest=num;
            }
            else if(num>thirdlargest){
                thirdlargest=num;
            }
        
        }
        if(thirdlargest==Long.MIN_VALUE){
            return (int)largest;
        }
    return (int) thirdlargest;
        
    }
}