class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int dist = 0;
                if (i >= start) {
                    dist = i - start;
                } else {
                    dist = start - i;
                }
                if (dist < min) {
                    min = dist;
                }
            }
        }
        return min;
    }
}