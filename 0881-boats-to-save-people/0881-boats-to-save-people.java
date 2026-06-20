class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int boat =0;
        int left =0;
        int right = people.length-1;

        while(left<right){

            int sum = people[left]+people[right];

            if(people[left]==limit){
                left++;
                boat++;
            }
            else if(people[right]==limit){
                right--;
                boat++;
            }
            
            else if(sum>limit){
                right--;
                boat++;
            }

            else if(sum==limit){
                left++;
                right--;
                boat++;
            }
            else {
                left++;
                right--;
                boat++;
            }


        }
        if(left==right){
            boat++;
        }
        return boat;
        
    }
}