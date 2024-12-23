class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (char ch: myString.toCharArray()) {
            if (Character.isUpperCase(ch)) ch = Character.toLowerCase(ch);
            if (ch == 'a') ch = 'A';
            
            answer += ch;
        }
        
        return answer;
    }
}