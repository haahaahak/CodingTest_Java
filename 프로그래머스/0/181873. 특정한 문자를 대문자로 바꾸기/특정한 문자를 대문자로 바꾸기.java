class Solution {
    public String solution(String my_string, String alp) {
         String answer = "";
        
         for(char ch: my_string.toCharArray()) {
             if (ch == alp.charAt(0)) ch = Character.toUpperCase(ch);
            
             answer += ch;
        }
        
        // replace로도 가능
        // return my_string.replaceAll(alp, alp.toUpperCase());
        
        
        return answer;
    }
}