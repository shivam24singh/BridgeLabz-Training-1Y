class Solution {
    public int totalFruit(int[] fruits) {
        int f =-1;
        int sec =-1;
        int start =0;
        int len =0;
        for(int i =0;i<fruits.length;i++){
            if(fruits[i]!=f&&f==-1){
                f = fruits[i];
            }
            if(fruits[i]!=f&&sec==-1){
                sec=fruits[i];
            }
            if(fruits[i]!=f&&fruits[i]!=sec){
                start = i-1;
                while(start>0&&fruits[start]==fruits[start-1]){
                    start--;
                }
                f= fruits[start];
                sec =fruits[i];
            }
            len = Math.max(len,i-start+1);
        }
        return len;
    }
}