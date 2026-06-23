class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}




// class Solution {
//     public void sortColors(int[] nums) {
//         int red=0;int white = 0;
//         int blue=0;

//     for(int i =0;i<nums.length;i++){
//         if(nums[i]==0){
//             red++;
//         }
//         if(nums[i]==1){
//             white++;
//         }
//         if(nums[i]==2){
//             blue++;
//         }
        
//     }
//     int index=0;
//     while(red>0){
//         nums[index]=0;
//         index++;
//         red--;
//     }
//     while(white>0){
//         nums[index]=1;
//         index++;
//         white--;
//     }
//     while(blue>0){
//         nums[index]=2;
//         index++;
//         blue--;
//     }

//     }
// }