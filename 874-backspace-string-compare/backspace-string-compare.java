class Solution {
    public boolean backspaceCompare(String s, String t) {
      Stack<Character> st = new Stack <>();
      Stack<Character> sb = new Stack<>();
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='#')
        {if(!st.isEmpty()){
            st.pop();}
        }
        else{
            st.push(ch);
        }
      }
         for(int i=0;i<t.length();i++){
        char c = t.charAt(i);
        if(c=='#')
        {if(!sb.isEmpty()){
            sb.pop();}
        }
        else{
            sb.push(c);
        }
      }
      return sb.equals(st);
    }
}