class Solution {
    public int kthFactor(int n, int k) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0)
                    return i;
            }
        }
        return -1;
        /*int[] arr = new int[n];
        int index = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                arr[index] = i;
                index++;
            }
        }
        if(k > index){
            return -1;
        }

        return arr[k - 1];*/
    }
}