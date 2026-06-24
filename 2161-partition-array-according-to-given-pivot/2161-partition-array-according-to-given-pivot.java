class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int index=0;
        int[] arr = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[index]=nums[i];
                index++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[index]=pivot;
                index++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[index]=nums[i];
                index++;
            }
        }
    return arr;
        
    }
}