class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int complement=target-nums[i];
                if(nums[i]!=complement){
                    map.put(nums[i],i);
                }
                if(map.containsKey(complement)){
                    return new int[]{map.get(complement),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        
    
    }
    
        
    
}