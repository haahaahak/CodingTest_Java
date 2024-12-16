class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        
        for (char ch: arr) {
            answer += String.valueOf(ch).repeat(n);
        }
        
        return answer;
    }
}