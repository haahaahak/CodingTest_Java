class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = "abcdefghij";
        
        String[] strArr = String.valueOf(age).split("");
        
        for (String str: strArr) {
            answer += ageStr.charAt(Integer.valueOf(str));    
        }   
        
        return answer;
    }
}