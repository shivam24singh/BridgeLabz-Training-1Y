class Solution {
    
    public static void countSort (int[] arr, int col) {
        int[] counts = new int[10];

        int powVal = (int) Math.pow(10, col-1);

        for(int i=0; i<arr.length; i++){
            int idx = (arr[i]/powVal) % 10;
            counts[idx] += 1;
        }

        int startIndex=0;

        for(int i=0; i<counts.length; i++){
            int curr = counts[i];
            counts[i] = startIndex;
            startIndex += curr;
        }

        int[] sortedArr = new int[arr.length];

        for(int i=0; i<sortedArr.length; i++){
            int idx = (arr[i]/powVal) % 10;
            sortedArr[counts[idx]] = arr[i];
            counts[idx] += 1;
        }

        for(int i=0; i<sortedArr.length; i++){
            arr[i] = sortedArr[i];
        }
    }

    public int maximumGap(int[] nums) {
        if(nums == null || nums.length < 2) return 0; 

        int[] arr = nums;
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        int len = 0;
        int temp = max;

        while(temp != 0){
            temp = temp / 10;
            len += 1;
        }
        
        if(len == 0) len = 1;

        for(int i=1; i<=len; i++){
            countSort(arr, i);
        }

        int maxG = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            maxG = Math.max(maxG, arr[i] - arr[i-1]);
        }
        return maxG;
    }
}