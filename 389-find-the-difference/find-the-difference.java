class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
         for(int i=0;i<t.length();i++){
            sum+=t.charAt(i);
         }
         for(int j=0;j<s.length();j++){
            sum-=s.charAt(j);
         }
         return (char)sum;
    }
}