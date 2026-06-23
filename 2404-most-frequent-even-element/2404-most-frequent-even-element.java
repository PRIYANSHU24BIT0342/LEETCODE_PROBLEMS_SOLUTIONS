class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxfreq=0;
        int element=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int freq = map.getOrDefault(nums[i],0)+1;
                map.put(nums[i],freq);
                if(freq>maxfreq){
                    maxfreq=freq;
                    element=nums[i];
                }
                else if(freq==maxfreq && nums[i]<element){
                    element=nums[i];
                }
            
            }
            
        }
       

    return element;
        
    }
}