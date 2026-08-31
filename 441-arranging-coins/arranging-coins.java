class Solution {
    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
		while(n > 0){ 
			i++;  
        	n = n-i; 
		}
		return i-1; 
    }
}