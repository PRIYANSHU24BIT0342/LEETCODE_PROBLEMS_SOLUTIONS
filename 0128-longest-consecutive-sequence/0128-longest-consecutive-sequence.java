import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxCount = 0;

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {

            int current = it.next();

            if (!set.contains(current - 1)) {

                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}